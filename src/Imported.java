public enum Imported {
	IMPORTED {
		@Override
		public double getImportDuty() {
			return 5;
		}
	}, LOCAL {
		@Override
		public double getImportDuty() {
			return 0;
		}
	};
	public abstract double getImportDuty();
}
