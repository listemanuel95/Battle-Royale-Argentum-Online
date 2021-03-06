package com.bonkan.brao.networking;

/**
 * <p>Un humilde homenaje al viejo y querido <b>ClientPacketIDs</b> :')</p>
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
	public static final int PACKET_TRY_OPEN_CHEST = 7;
	public static final int PACKET_CHEST_OPENED = 8;
	public static final int PACKET_ITEM_THROWN = 9;
	public static final int PACKET_PLAYER_REQUEST_GET_ITEM = 10;
	public static final int PACKET_PLAYER_CONFIRM_GET_ITEM = 11;
	public static final int PACKET_REMOVE_ITEM_FROM_FLOOR = 12;
	public static final int PACKET_USER_IN_AREA_EQUIPPED_ITEM = 13;
	public static final int PACKET_PLAYER_REQUEST_FULL_BODY = 14;
	public static final int PACKET_PLAYER_SEND_FULL_BODY = 15;
	public static final int PACKET_USER_ENTERED_PLAYER_AREA = 16;
	public static final int PACKET_PLAYER_REQUEST_UNEQUIP_ITEM = 17;
	public static final int PACKET_PLAYER_CONFIRM_UNEQUIP_ITEM = 18;
	public static final int PACKET_PLAYER_REMOVE_POTION = 19;
	public static final int PACKET_PLAYER_REQUEST_UNEQUIP_SPELL = 20;
	public static final int PACKET_PLAYER_CONFIRM_UNEQUIP_SPELL = 21;
	public static final int PACKET_PLAYER_REQUEST_SPELL_SWAP = 22;
	public static final int PACKET_PLAYER_CONFIRM_SPELL_SWAP = 23;
	public static final int PACKET_PLAYER_REQUEST_CAST_SPELL = 24;
	public static final int PACKET_PLAYER_CONFIRM_CAST_SPELL = 25;
	public static final int PACKET_UPDATE_PLAYER_HP_AND_MANA = 26;
	public static final int PACKET_USER_IN_AREA_CASTED_SPELL = 27;
	public static final int PACKET_PLAYER_REQUEST_USE_POTION = 28;
	public static final int PACKET_PLAYER_CONFIRM_USE_POTION = 29;
	public static final int PACKET_PLAYER_HIT_USER_WITH_SPELL = 30;
	public static final int PACKET_RECEIVE_DAMAGE = 31;
	public static final int PACKET_USER_IN_AREA_RECEIVED_DAMAGE = 32;
	public static final int PACKET_EXPLODE_USER_SPELL = 33;
	public static final int PACKET_CONFIRM_EXPLODE_USER_SPELL = 34;
	
}
