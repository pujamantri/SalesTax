
public enum Imported {
	IMPORTED {
		@Override
		public float getImportDuty() {
			return 5;
		}
	}, LOCAL {
		@Override
		public float getImportDuty() {
			return 0;
		}
	};
	public abstract float getImportDuty();
}
