class Average {
  double note = 0;
  double nombreDeNotes = 0;

  void InsertNote(double note) {
    this.note += note;
    nombreDeNotes++;
  }

  double calculateAverage() {
    return note / nombreDeNotes;
  }
}
