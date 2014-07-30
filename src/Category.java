
public enum Category {
	BOOK {
		@Override
		public float getSalesTax() {
			return 0;
		}
	}, 
	FOOD {
		@Override
		public float getSalesTax() {
			return 0;
		}
	},
	MEDICAL_PRODUCTS {
		@Override
		public float getSalesTax() {
			return 0;
		}
	},
	OTHERS {
		@Override
		public float getSalesTax() {
			return 10;
		}
	};
	
	abstract float getSalesTax();
}
