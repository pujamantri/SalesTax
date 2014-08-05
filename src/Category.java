public enum Category {
	BOOK {
		@Override
		public double getSalesTax() {
			return 0;
		}
	}, 
	FOOD {
		@Override
		public double getSalesTax() {
			return 0;
		}
	},
	MEDICAL_PRODUCTS {
		@Override
		public double getSalesTax() {
			return 0;
		}
	},
	OTHERS {
		@Override
		public double getSalesTax() {
			return 10;
		}
	};
	
	abstract double getSalesTax();
}
