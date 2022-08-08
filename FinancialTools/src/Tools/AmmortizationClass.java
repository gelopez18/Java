	package Tools;

	public class AmmortizationClass {
		/* ----- P[i(1+r)^n/((1+r)^n)-1)]
		 * TMP = Total Monthly payment
		 * */
		public int totalNofPymt; //n	=	total number of payments
		public double Principal;//P	=	amount of principal, net of initial payments
		public double  rate;//i	=	periodic interest rate
		

		public double getPrincipal() {
			return Principal;
		}
		public void setPrincipal(double principal) {
			Principal = principal;
		}
		public int getTotalNofPymt() {
			return totalNofPymt;
		}
		public void setTotalNofPymt(int totalNofPymt) {
			this.totalNofPymt = totalNofPymt;
		}
		public double getRate() {
			return rate;
		}
		public void setRate(double rate) {
			this.rate = rate;
		}

	}

