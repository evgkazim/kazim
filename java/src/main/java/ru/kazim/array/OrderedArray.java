package ru.kazim.array;

/**
 * Класс упорядоченного массива с высокоуровневым интерфейсом
 */
class OrderedArray
{
	private long[] a;
	private int nElements;

	OrderedArray(int nElements)
	{
		a = new long[nElements];
		this.nElements = 0;
	}

	public int find(long searchKey)
	{
		int lowerBound = 0;
		int upperBound = nElements - 1;
		int curIn;

		while (true)
		{
			curIn = (lowerBound + upperBound) / 2;
			if (a[curIn] == searchKey)
			{
				return curIn;
			}
			else if (lowerBound > upperBound)
			{
				return nElements;
			}
			else
			{
				if (a[curIn] < searchKey)
				{
					lowerBound = curIn + 1;
				}
				else
				{
					upperBound = curIn - 1;
				}
			}
		}
	}

	public void insert(long value)
	{
		int lowerBound = 0;
		int upperBound = nElements - 1;
		int curIn;

		while (true)
		{
			curIn = (lowerBound + upperBound) / 2;
			if (a[curIn] == value)
			{
				break;
			}
			else if (lowerBound > upperBound)
			{
				if (value >= a[curIn])
				{
					if (a[curIn] == 0 && nElements == 0)
					{
						curIn = 0;
					}
					else
					{
						curIn++;
					}
				}
				break;
			}
			else
			{
				if (a[curIn] < value)
				{
					lowerBound = curIn + 1;
				}
				else
				{
					upperBound = curIn - 1;
				}
			}
		}

		for (int j = nElements; j > curIn; j--)
		{
			a[j] = a[j - 1];
		}

		a[curIn] = value;
		nElements++;
	}

	public boolean delete(long value)
	{
		int i = find(value);
		if (i == nElements)
		{
			return false;
		}
		else
		{
			for (int k = i; k < nElements - 1; k++)
			{
				a[k] = a[k + 1];
			}
			nElements--;
			return true;
		}
	}

	int getSize()
	{
		return nElements;
	}

	void merge(long[] inputArray)
	{
		for (long value : inputArray)
		{
			if (find(value) == nElements)
			{
				insert(value);
			}
		}
	}

	String getValues()
	{
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < nElements; i++)
		{
			builder.append(a[i]);
			if (i != nElements - 1)
			{
				builder.append(", ");
			}
		}

		return builder.toString();
	}
}