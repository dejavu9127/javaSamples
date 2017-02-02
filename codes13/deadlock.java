Thread1...

synchronized(X)
{
	synchronized(Y)
	{

	}
}

Thread2...

synchronized(Y)
{
	synchronized(X)
	{
	}
}