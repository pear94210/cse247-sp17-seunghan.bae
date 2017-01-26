package studio1;

import timing.ExecuteAlgorithm;
import timing.Ticker;
import timing.quiet.QuietAlgorithm;
import timing.utils.GenSizes;
import timing.utils.IntArrayGenerator;


public class ProbA extends QuietAlgorithm {

	protected Ticker ticker;
	protected long   sum;

	public ProbA() {

	}

	/**
	 * Begin with an array of two elements.
	 */
	@Override
	public void reset(Ticker ticker) {
		this.ticker = ticker;
	}

	/**
	 * As a "quiet" algorithm, all we care about is the
	 * parameter n.
	 */
	@Override
	public void run() {
		int j = 1;
		while (j < n) {
			int k = n;
			//
			// Here
			ticker.tick();
			//				
			while (k > j) {
				k = k - 1;
			}
			j = j + 1;
		}
	}
	// n = 0 : 0
	// n = 1 : 0
	// n = 2 : 1
	// n = 3 : 2
	// formula = n - 1 for n >= 1
	
	public String toString() {
		return "Problem A";
	}

	public static void main(String[] args) {
		GenSizes sizes = GenSizes.arithmetic(0, 100, 1);
		ExecuteAlgorithm.timeAlgorithm(
				"ProbA", 
				"studio1.ProbA", 
				new IntArrayGenerator(), 
				sizes
				);	
	}

}
