package de.tum.in.www1.jReto.module.api;

/**
* An Address encapsulates the necessary information for the peer to establish a connection to another peer.
* Addresses are generated and distributed by an Advertiser. The Advertiser also ensures that the Address is functional by accepting connections.
* These advertised Addresses can then be discovered by Browsers.
*/
public interface Address {
    /** 
    * Called to establish a new outgoing connection.
    * @return A new connection to the peer.
    */
	Connection createConnection();
	/** The cost of an address gives an heuristic about which Address should be used if multiple are available. Lower cost is preferred. An WlanAddress uses a cost of 10. */ 
	int getCost();
}
