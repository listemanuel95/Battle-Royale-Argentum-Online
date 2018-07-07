package com.bonkan.brao.server.packets;

/**
 * <p>Humilde homenaje al viejo y querido <b>ServerPacketIDs</b></p>
 */
public class PacketIDs {

	// paquetes generales
	public static final int PACKET_LOGIN = 0;
	public static final int PACKET_LOGIN_SUCCESS = 1;
	public static final int PACKET_LOGIN_FAILED = 2;
	
	// paquetes de PARTIDA
	public static final int PACKET_PLAYER_CHANGED_STATE = 3;
	public static final int PACKET_USER_CHANGED_STATE = 4;
	public static final int PACKET_PLAYER_MOVED = 5;
	public static final int PACKET_USER_MOVED = 6;
	public static final int PACKET_USER_ENTERED_AREA = 7;
	public static final int PACKET_TRY_OPEN_CHEST = 8;
	public static final int PACKET_CHEST_OPENED = 9;
	public static final int PACKET_ITEM_THROWN = 10;
	public static final int PACKET_PLAYER_REQUEST_GET_ITEM = 11;
	public static final int PACKET_PLAYER_CONFIRM_GET_ITEM = 12;
	public static final int PACKET_REMOVE_ITEM_FROM_FLOOR = 13;
}
