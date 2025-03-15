#!/bin/bash

# ========================================================
# Internet Speed Test Script
# ========================================================
# Description: This script uses the 'speedtest' command to test
#              internet speed and display results in a user-friendly format
# Requirements: speedtest CLI (https://www.speedtest.net/apps/cli)
# By BMR 2025 <<LinkedIn: https://www.linkedin.com/in/bmr2025>>
# ========================================================

# Colors for output formatting
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[0;33m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

# Default log file location
LOG_FILE="$HOME/internet_speed_logs.csv"
SAVE_TO_LOG=false

# Function to display script usage
show_usage() {
  echo -e "${BLUE}Usage:${NC}"
  echo -e "  $0 [options]"
  echo
  echo -e "${BLUE}Options:${NC}"
  echo -e "  -h, --help       Show this help message"
  echo -e "  -l, --log        Save results to log file ($LOG_FILE)"
  echo -e "  -f, --file FILE  Specify custom log file location"
  echo
  echo -e "${BLUE}Example:${NC}"
  echo -e "  $0 --log"
  echo -e "  $0 --file /path/to/custom_log.csv"
}

# Function to check if speedtest command is available
check_speedtest() {
  if ! command -v speedtest &>/dev/null; then
    echo -e "${RED}Error: 'speedtest' command not found.${NC}"
    echo -e "Please install Speedtest CLI from https://www.speedtest.net/apps/cli"
    exit 1
  fi
}

# Function to run internet speed test
run_speed_test() {
  echo -e "${YELLOW}Running internet speed test...${NC}"
  echo -e "${YELLOW}Please wait, this may take a minute...${NC}"
  echo

  # Run speedtest command with JSON output for easier parsing
  RESULT=$(speedtest --format=json)

  # Extract values from JSON result
  TIMESTAMP=$(date "+%Y-%m-%d %H:%M:%S")
  SERVER=$(echo $RESULT | grep -o '"server":{[^}]*}' | grep -o '"name":"[^"]*"' | cut -d'"' -f4)
  LOCATION=$(echo $RESULT | grep -o '"server":{[^}]*}' | grep -o '"location":"[^"]*"' | cut -d'"' -f4)
  PING=$(echo $RESULT | grep -o '"ping":{[^}]*}' | grep -o '"latency":[^,]*' | cut -d':' -f2)
  DOWNLOAD=$(echo $RESULT | grep -o '"download":{[^}]*}' | grep -o '"bandwidth":[^,]*' | cut -d':' -f2)
  UPLOAD=$(echo $RESULT | grep -o '"upload":{[^}]*}' | grep -o '"bandwidth":[^,]*' | cut -d':' -f2)

  # Convert bandwidth from bytes/s to Mbps
  DOWNLOAD_MBPS=$(echo "scale=2; $DOWNLOAD / 125000" | bc)
  UPLOAD_MBPS=$(echo "scale=2; $UPLOAD / 125000" | bc)

  # Display results
  echo -e "${BLUE}=== Internet Speed Test Results ===${NC}"
  echo -e "${BLUE}Date and Time:${NC} $TIMESTAMP"
  echo -e "${BLUE}Server:${NC} $SERVER ($LOCATION)"
  echo -e "${BLUE}Ping:${NC} ${GREEN}$PING ms${NC}"
  echo -e "${BLUE}Download:${NC} ${GREEN}$DOWNLOAD_MBPS Mbps${NC}"
  echo -e "${BLUE}Upload:${NC} ${GREEN}$UPLOAD_MBPS Mbps${NC}"
  echo

  # Save to log if requested
  if $SAVE_TO_LOG; then
    # Create header if file doesn't exist
    if [ ! -f "$LOG_FILE" ]; then
      echo "Timestamp,Server,Location,Ping(ms),Download(Mbps),Upload(Mbps)" >"$LOG_FILE"
    fi

    # Append data to log file
    echo "$TIMESTAMP,$SERVER,$LOCATION,$PING,$DOWNLOAD_MBPS,$UPLOAD_MBPS" >>"$LOG_FILE"
    echo -e "${GREEN}Results saved to $LOG_FILE${NC}"
  fi
}
# Parse command line arguments
while [[ $# -gt 0 ]]; do
  case $1 in
  -h | --help)
    show_usage
    exit 0
    ;;
  -l | --log)
    SAVE_TO_LOG=true
    shift
    ;;
  -f | --file)
    LOG_FILE="$2"
    SAVE_TO_LOG=true
    shift 2
    ;;
  *)
    echo -e "${RED}Unknown option: $1${NC}"
    show_usage
    exit 1
    ;;
  esac
done

# Main execution
check_speedtest
run_speed_test

exit 0
