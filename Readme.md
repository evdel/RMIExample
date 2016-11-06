** This is a simple example project using the Java RMI**

It is based on a guitar, which we can play open strings.
If I say to the guitar to play the first open string, it will return E.
More generally, given the string number, the guitar returns the corresponding note.

On the client side, there is the stub which implements the same interface as the guitar, hence acts as a proxy.

On the server side, there is the registry,  the skeleton and the guitar.
