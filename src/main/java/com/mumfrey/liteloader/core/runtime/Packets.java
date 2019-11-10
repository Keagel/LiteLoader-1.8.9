package com.mumfrey.liteloader.core.runtime;

import java.util.HashMap;
import java.util.Map;

/**
 * Packet obfuscation table
 *
 * @author Adam Mummery-Smith
 * TODO Obfuscation 1.8.9
 */
public final class Packets extends Obf
{
    /**
     * Since we need to catch and deal with the fact that a packet is first
     * marshalled across threads via PacketThreadUtil, we will need to know
     * which owner object to check against the current thread in order to detect
     * when the packet instance is being processed by the main message loop. The
     * Context object describes in which context (client or server) that a
     * particular packet will be processed in on the <em>receiving</em> end, and
     * thus which object to check threading against.
     * 
     * @author Adam Mummery-Smith
     */
    public enum Context
    {
        CLIENT,
        SERVER
    }
    
    // CHECKSTYLE:OFF

    private static Map<String, Packets> packetMap = new HashMap<String, Packets>();

    public static Packets S08PacketPlayerPosLook           = new Packets("net.minecraft.network.play.server.S08PacketPlayerPosLook",                    "fi", Context.CLIENT);
    public static Packets S0EPacketSpawnObject             = new Packets("net.minecraft.network.play.server.S0EPacketSpawnObject",                      "fk", Context.CLIENT);
    public static Packets S11PacketSpawnExperienceOrb      = new Packets("net.minecraft.network.play.server.S11PacketSpawnExperienceOrb",               "fl", Context.CLIENT);
    public static Packets S2CPacketSpawnGlobalEntity       = new Packets("net.minecraft.network.play.server.S2CPacketSpawnGlobalEntity",                "fm", Context.CLIENT);
    public static Packets S0FPacketSpawnMob                = new Packets("net.minecraft.network.play.server.S0FPacketSpawnMob",                         "fn", Context.CLIENT);
    public static Packets S10PacketSpawnPainting           = new Packets("net.minecraft.network.play.server.S10PacketSpawnPainting",                    "fo", Context.CLIENT);
    public static Packets S0CPacketSpawnPlayer             = new Packets("net.minecraft.network.play.server.S0CPacketSpawnPlayer",                      "fp", Context.CLIENT);
    public static Packets S0BPacketAnimation               = new Packets("net.minecraft.network.play.server.S0BPacketAnimation",                        "fq", Context.CLIENT);
    public static Packets S37PacketStatistics              = new Packets("net.minecraft.network.play.server.S37PacketStatistics",                       "fr", Context.CLIENT);
    public static Packets S25PacketBlockBreakAnim          = new Packets("net.minecraft.network.play.server.S25PacketBlockBreakAnim",                   "fs", Context.CLIENT);
    public static Packets S35PacketUpdateTileEntity        = new Packets("net.minecraft.network.play.server.S35PacketUpdateTileEntity",                 "ft", Context.CLIENT);
    public static Packets S24PacketBlockAction             = new Packets("net.minecraft.network.play.server.S24PacketBlockAction",                      "fu", Context.CLIENT);
    public static Packets S23PacketBlockChange             = new Packets("net.minecraft.network.play.server.S23PacketBlockChange",                      "fv", Context.CLIENT);
    public static Packets S41PacketServerDifficulty        = new Packets("net.minecraft.network.play.server.S41PacketServerDifficulty",                 "fw", Context.CLIENT);
    public static Packets S3APacketTabComplete             = new Packets("net.minecraft.network.play.server.S3APacketTabComplete",                      "fx", Context.CLIENT);
    public static Packets S02PacketChat                    = new Packets("net.minecraft.network.play.server.S02PacketChat",                             "fy", Context.CLIENT);
    public static Packets S22PacketMultiBlockChange        = new Packets("net.minecraft.network.play.server.S22PacketMultiBlockChange",                 "fz", Context.CLIENT);
    public static Packets S32PacketConfirmTransaction      = new Packets("net.minecraft.network.play.server.S32PacketConfirmTransaction",               "ga", Context.CLIENT);
    public static Packets S2EPacketCloseWindow             = new Packets("net.minecraft.network.play.server.S2EPacketCloseWindow",                      "gb", Context.CLIENT);
    public static Packets S2DPacketOpenWindow              = new Packets("net.minecraft.network.play.server.S2DPacketOpenWindow",                       "gc", Context.CLIENT);
    public static Packets S30PacketWindowItems             = new Packets("net.minecraft.network.play.server.S30PacketWindowItems",                      "gd", Context.CLIENT);
    public static Packets S31PacketWindowProperty          = new Packets("net.minecraft.network.play.server.S31PacketWindowProperty",                   "ge", Context.CLIENT);
    public static Packets S2FPacketSetSlot                 = new Packets("net.minecraft.network.play.server.S2FPacketSetSlot",                          "gf", Context.CLIENT);
    public static Packets S3FPacketCustomPayload           = new Packets("net.minecraft.network.play.server.S3FPacketCustomPayload",                    "gg", Context.CLIENT);
    public static Packets S40PacketDisconnect              = new Packets("net.minecraft.network.play.server.S40PacketDisconnect",                       "gh", Context.CLIENT);
    public static Packets S19PacketEntityStatus            = new Packets("net.minecraft.network.play.server.S19PacketEntityStatus",                     "gi", Context.CLIENT);
    public static Packets S49PacketUpdateEntityNBT         = new Packets("net.minecraft.network.play.server.S49PacketUpdateEntityNBT",                  "gj", Context.CLIENT);
    public static Packets S27PacketExplosion               = new Packets("net.minecraft.network.play.server.S27PacketExplosion",                        "gk", Context.CLIENT);
    public static Packets S46PacketSetCompressionLevel     = new Packets("net.minecraft.network.play.server.S46PacketSetCompressionLevel",              "gl", Context.CLIENT);
    public static Packets S2BPacketChangeGameState         = new Packets("net.minecraft.network.play.server.S2BPacketChangeGameState",                  "gm", Context.CLIENT);
    public static Packets S00PacketKeepAlive               = new Packets("net.minecraft.network.play.server.S00PacketKeepAlive",                        "gn", Context.CLIENT);
    public static Packets S21PacketChunkData               = new Packets("net.minecraft.network.play.server.S21PacketChunkData",                        "go", Context.CLIENT);
    public static Packets S26PacketMapChunkBulk            = new Packets("net.minecraft.network.play.server.S26PacketMapChunkBulk",                     "gp", Context.CLIENT);
    public static Packets S28PacketEffect                  = new Packets("net.minecraft.network.play.server.S28PacketEffect",                           "gq", Context.CLIENT);
    public static Packets S2APacketParticles               = new Packets("net.minecraft.network.play.server.S2APacketParticles",                        "gr", Context.CLIENT);
    public static Packets S29PacketSoundEffect             = new Packets("net.minecraft.network.play.server.S29PacketSoundEffect",                      "gs", Context.CLIENT);
    public static Packets S01PacketJoinGame                = new Packets("net.minecraft.network.play.server.S01PacketJoinGame",                         "gt", Context.CLIENT);
    public static Packets S34PacketMaps                    = new Packets("net.minecraft.network.play.server.S34PacketMaps",                             "gu", Context.CLIENT);
    public static Packets S14PacketEntity                  = new Packets("net.minecraft.network.play.server.S14PacketEntity",                           "gv", Context.CLIENT);
    public static Packets S15PacketEntityRelMove           = new Packets("net.minecraft.network.play.server.S14PacketEntity$S15PacketEntityRelMove",    "gv$a", Context.CLIENT);
    public static Packets S17PacketEntityLookMove          = new Packets("net.minecraft.network.play.server.S14PacketEntity$S17PacketEntityLookMove",   "gv$b", Context.CLIENT);
    public static Packets S16PacketEntityLook              = new Packets("net.minecraft.network.play.server.S14PacketEntity$S16PacketEntityLook",       "gv$c", Context.CLIENT);
    public static Packets S36PacketSignEditorOpen          = new Packets("net.minecraft.network.play.server.S36PacketSignEditorOpen",                   "gw", Context.CLIENT);
    public static Packets S39PacketPlayerAbilities         = new Packets("net.minecraft.network.play.server.S39PacketPlayerAbilities",                  "gx", Context.CLIENT);
    public static Packets S42PacketCombatEvent             = new Packets("net.minecraft.network.play.server.S42PacketCombatEvent",                      "gy", Context.CLIENT);
    public static Packets S38PacketPlayerListItem          = new Packets("net.minecraft.network.play.server.S38PacketPlayerListItem",                   "gz", Context.CLIENT);
    public static Packets S0APacketUseBed                  = new Packets("net.minecraft.network.play.server.S0APacketUseBed",                           "ha", Context.CLIENT);
    public static Packets S13PacketDestroyEntities         = new Packets("net.minecraft.network.play.server.S13PacketDestroyEntities",                  "hb", Context.CLIENT);
    public static Packets S1EPacketRemoveEntityEffect      = new Packets("net.minecraft.network.play.server.S1EPacketRemoveEntityEffect",               "hc", Context.CLIENT);
    public static Packets S48PacketResourcePackSend        = new Packets("net.minecraft.network.play.server.S48PacketResourcePackSend",                 "hd", Context.CLIENT);
    public static Packets S07PacketRespawn                 = new Packets("net.minecraft.network.play.server.S07PacketRespawn",                          "he", Context.CLIENT);
    public static Packets S19PacketEntityHeadLook          = new Packets("net.minecraft.network.play.server.S19PacketEntityHeadLook",                   "hf", Context.CLIENT);
    public static Packets S44PacketWorldBorder             = new Packets("net.minecraft.network.play.server.S44PacketWorldBorder",                      "hg", Context.CLIENT);
    public static Packets S43PacketCamera                  = new Packets("net.minecraft.network.play.server.S43PacketCamera",                           "hh", Context.CLIENT);
    public static Packets S09PacketHeldItemChange          = new Packets("net.minecraft.network.play.server.S09PacketHeldItemChange",                   "hi", Context.CLIENT);
    public static Packets S3DPacketDisplayScoreboard       = new Packets("net.minecraft.network.play.server.S3DPacketDisplayScoreboard",                "hj", Context.CLIENT);
    public static Packets S1CPacketEntityMetadata          = new Packets("net.minecraft.network.play.server.S1CPacketEntityMetadata",                   "hk", Context.CLIENT);
    public static Packets S1BPacketEntityAttach            = new Packets("net.minecraft.network.play.server.S1BPacketEntityAttach",                     "hl", Context.CLIENT);
    public static Packets S12PacketEntityVelocity          = new Packets("net.minecraft.network.play.server.S12PacketEntityVelocity",                   "hm", Context.CLIENT);
    public static Packets S04PacketEntityEquipment         = new Packets("net.minecraft.network.play.server.S04PacketEntityEquipment",                  "hn", Context.CLIENT);
    public static Packets S1FPacketSetExperience           = new Packets("net.minecraft.network.play.server.S1FPacketSetExperience",                    "ho", Context.CLIENT);
    public static Packets S06PacketUpdateHealth            = new Packets("net.minecraft.network.play.server.S06PacketUpdateHealth",                     "hp", Context.CLIENT);
    public static Packets S3BPacketScoreboardObjective     = new Packets("net.minecraft.network.play.server.S3BPacketScoreboardObjective",              "hq", Context.CLIENT);
    public static Packets S3EPacketTeams                   = new Packets("net.minecraft.network.play.server.S3EPacketTeams",                            "hr", Context.CLIENT);
    public static Packets S3CPacketUpdateScore             = new Packets("net.minecraft.network.play.server.S3CPacketUpdateScore",                      "hs", Context.CLIENT);
    public static Packets S05PacketSpawnPosition           = new Packets("net.minecraft.network.play.server.S05PacketSpawnPosition",                    "ht", Context.CLIENT);
    public static Packets S03PacketTimeUpdate              = new Packets("net.minecraft.network.play.server.S03PacketTimeUpdate",                       "hu", Context.CLIENT);
    public static Packets S45PacketTitle                   = new Packets("net.minecraft.network.play.server.S45PacketTitle",                            "hv", Context.CLIENT);
    public static Packets S33PacketUpdateSign              = new Packets("net.minecraft.network.play.server.S33PacketUpdateSign",                       "hw", Context.CLIENT);
    public static Packets S47PacketPlayerListHeaderFooter  = new Packets("net.minecraft.network.play.server.S47PacketPlayerListHeaderFooter",           "hx", Context.CLIENT);
    public static Packets S0DPacketCollectItem             = new Packets("net.minecraft.network.play.server.S0DPacketCollectItem",                      "hy", Context.CLIENT);
    public static Packets S18PacketEntityTeleport          = new Packets("net.minecraft.network.play.server.S18PacketEntityTeleport",                   "hz", Context.CLIENT);
    public static Packets S20PacketEntityProperties        = new Packets("net.minecraft.network.play.server.S20PacketEntityProperties",                 "ia", Context.CLIENT);
    public static Packets S1DPacketEntityEffect            = new Packets("net.minecraft.network.play.server.S1DPacketEntityEffect",                     "ib", Context.CLIENT);
    public static Packets C14PacketTabComplete             = new Packets("net.minecraft.network.play.client.C14PacketTabComplete",                      "id", Context.SERVER);
    public static Packets C01PacketChatMessage             = new Packets("net.minecraft.network.play.client.C01PacketChatMessage",                      "ie", Context.SERVER);
    public static Packets C16PacketClientStatus            = new Packets("net.minecraft.network.play.client.C16PacketClientStatus",                     "ig", Context.SERVER);
    public static Packets C15PacketClientSettings          = new Packets("net.minecraft.network.play.client.C15PacketClientSettings",                   "ih", Context.SERVER);
    public static Packets C0FPacketConfirmTransaction      = new Packets("net.minecraft.network.play.client.C0FPacketConfirmTransaction",               "ii", Context.SERVER);
    public static Packets C11PacketEnchantItem             = new Packets("net.minecraft.network.play.client.C11PacketEnchantItem",                      "ij", Context.SERVER);
    public static Packets C0EPacketClickWindow             = new Packets("net.minecraft.network.play.client.C0EPacketClickWindow",                      "ik", Context.SERVER);
    public static Packets C0DPacketCloseWindow             = new Packets("net.minecraft.network.play.client.C0DPacketCloseWindow",                      "il", Context.SERVER);
    public static Packets C17PacketCustomPayload           = new Packets("net.minecraft.network.play.client.C17PacketCustomPayload",                    "im", Context.SERVER);
    public static Packets C02PacketUseEntity               = new Packets("net.minecraft.network.play.client.C02PacketUseEntity",                        "in", Context.SERVER);
    public static Packets C00PacketKeepAlive               = new Packets("net.minecraft.network.play.client.C00PacketKeepAlive",                        "io", Context.SERVER);
    public static Packets C03PacketPlayer                  = new Packets("net.minecraft.network.play.client.C03PacketPlayer",                           "ip", Context.SERVER);
    public static Packets C04PacketPlayerPosition          = new Packets("net.minecraft.network.play.client.C03PacketPlayer$C04PacketPlayerPosition",   "ip$a", Context.SERVER);
    public static Packets C06PacketPlayerPosLook           = new Packets("net.minecraft.network.play.client.C03PacketPlayer$C06PacketPlayerPosLook",    "ip$b", Context.SERVER);
    public static Packets C05PacketPlayerLook              = new Packets("net.minecraft.network.play.client.C03PacketPlayer$C05PacketPlayerLook",       "ip$c", Context.SERVER);
    public static Packets C13PacketPlayerAbilities         = new Packets("net.minecraft.network.play.client.C13PacketPlayerAbilities",                  "iq", Context.SERVER);
    public static Packets C07PacketPlayerDigging           = new Packets("net.minecraft.network.play.client.C07PacketPlayerDigging",                    "ir", Context.SERVER);
    public static Packets C0BPacketEntityAction            = new Packets("net.minecraft.network.play.client.C0BPacketEntityAction",                     "is", Context.SERVER);
    public static Packets C0CPacketInput                   = new Packets("net.minecraft.network.play.client.C0CPacketInput",                            "it", Context.SERVER);
    public static Packets C19PacketResourcePackStatus      = new Packets("net.minecraft.network.play.client.C19PacketResourcePackStatus",               "iu", Context.SERVER);
    public static Packets C09PacketHeldItemChange          = new Packets("net.minecraft.network.play.client.C09PacketHeldItemChange",                   "iv", Context.SERVER);
    public static Packets C10PacketCreativeInventoryAction = new Packets("net.minecraft.network.play.client.C10PacketCreativeInventoryAction",          "iw", Context.SERVER);
    public static Packets C12PacketUpdateSign              = new Packets("net.minecraft.network.play.client.C12PacketUpdateSign",                       "ix", Context.SERVER);
    public static Packets C0APacketAnimation               = new Packets("net.minecraft.network.play.client.C0APacketAnimation",                        "iy", Context.SERVER);
    public static Packets C18PacketSpectate                = new Packets("net.minecraft.network.play.client.C18PacketSpectate",                         "iz", Context.SERVER);
    public static Packets C08PacketPlayerBlockPlacement    = new Packets("net.minecraft.network.play.client.C08PacketPlayerBlockPlacement",             "ja", Context.SERVER);
    public static Packets C00Handshake                     = new Packets("net.minecraft.network.handshake.client.C00Handshake",                         "jc", Context.SERVER);
    public static Packets S02PacketLoginSuccess            = new Packets("net.minecraft.network.login.server.S02PacketLoginSuccess",                    "jg", Context.CLIENT);
    public static Packets S01PacketEncryptionRequest       = new Packets("net.minecraft.network.login.server.S01PacketEncryptionRequest",               "jh", Context.CLIENT);
    public static Packets S03PacketEnableCompression       = new Packets("net.minecraft.network.login.server.S03PacketEnableCompression",               "ji", Context.CLIENT);
    public static Packets S00PacketDisconnect              = new Packets("net.minecraft.network.login.server.S00PacketDisconnect",                      "jj", Context.CLIENT);
    public static Packets C00PacketLoginStart              = new Packets("net.minecraft.network.login.client.C00PacketLoginStart",                      "jl", Context.SERVER);
    public static Packets C01PacketEncryptionResponse      = new Packets("net.minecraft.network.login.client.C01PacketEncryptionResponse",              "jm", Context.SERVER);
    public static Packets S01PacketPong                    = new Packets("net.minecraft.network.status.server.S01PacketPong",                           "jq", Context.CLIENT);
    public static Packets S00PacketServerInfo              = new Packets("net.minecraft.network.status.server.S00PacketServerInfo",                     "jr", Context.CLIENT);
    public static Packets C01PacketPing                    = new Packets("net.minecraft.network.status.client.C01PacketPing",                           "ju", Context.SERVER);
    public static Packets C00PacketServerQuery             = new Packets("net.minecraft.network.status.client.C00PacketServerQuery",                    "jv", Context.SERVER);

    // CHECKSTYLE:ON

    public static final Packets[] packets = new Packets[] {
            S08PacketPlayerPosLook,
            S0EPacketSpawnObject,
            S11PacketSpawnExperienceOrb,
            S2CPacketSpawnGlobalEntity,
            S0FPacketSpawnMob,
            S10PacketSpawnPainting,
            S0CPacketSpawnPlayer,
            S0BPacketAnimation,
            S37PacketStatistics,
            S25PacketBlockBreakAnim,
            S35PacketUpdateTileEntity,
            S24PacketBlockAction,
            S23PacketBlockChange,
            S41PacketServerDifficulty,
            S3APacketTabComplete,
            S02PacketChat,
            S22PacketMultiBlockChange,
            S32PacketConfirmTransaction,
            S2EPacketCloseWindow,
            S2DPacketOpenWindow,
            S30PacketWindowItems,
            S31PacketWindowProperty,
            S2FPacketSetSlot,
            S3FPacketCustomPayload,
            S40PacketDisconnect,
            S19PacketEntityStatus,
            S49PacketUpdateEntityNBT,
            S27PacketExplosion,
            S46PacketSetCompressionLevel,
            S2BPacketChangeGameState,
            S00PacketKeepAlive,
            S21PacketChunkData,
            S26PacketMapChunkBulk,
            S28PacketEffect,
            S2APacketParticles,
            S29PacketSoundEffect,
            S01PacketJoinGame,
            S34PacketMaps,
            S14PacketEntity,
            S15PacketEntityRelMove,
            S17PacketEntityLookMove,
            S16PacketEntityLook,
            S36PacketSignEditorOpen,
            S39PacketPlayerAbilities,
            S42PacketCombatEvent,
            S38PacketPlayerListItem,
            S0APacketUseBed,
            S13PacketDestroyEntities,
            S1EPacketRemoveEntityEffect,
            S48PacketResourcePackSend,
            S07PacketRespawn,
            S19PacketEntityHeadLook,
            S44PacketWorldBorder,
            S43PacketCamera,
            S09PacketHeldItemChange,
            S3DPacketDisplayScoreboard,
            S1CPacketEntityMetadata,
            S1BPacketEntityAttach,
            S12PacketEntityVelocity,
            S04PacketEntityEquipment,
            S1FPacketSetExperience,
            S06PacketUpdateHealth,
            S3BPacketScoreboardObjective,
            S3EPacketTeams,
            S3CPacketUpdateScore,
            S05PacketSpawnPosition,
            S03PacketTimeUpdate,
            S45PacketTitle,
            S33PacketUpdateSign,
            S47PacketPlayerListHeaderFooter,
            S0DPacketCollectItem,
            S18PacketEntityTeleport,
            S20PacketEntityProperties,
            S1DPacketEntityEffect,
            C14PacketTabComplete,
            C01PacketChatMessage,
            C16PacketClientStatus,
            C15PacketClientSettings,
            C0FPacketConfirmTransaction,
            C11PacketEnchantItem,
            C0EPacketClickWindow,
            C0DPacketCloseWindow,
            C17PacketCustomPayload,
            C02PacketUseEntity,
            C00PacketKeepAlive,
            C03PacketPlayer,
            C04PacketPlayerPosition,
            C06PacketPlayerPosLook,
            C05PacketPlayerLook,
            C13PacketPlayerAbilities,
            C07PacketPlayerDigging,
            C0BPacketEntityAction,
            C0CPacketInput,
            C19PacketResourcePackStatus,
            C09PacketHeldItemChange,
            C10PacketCreativeInventoryAction,
            C12PacketUpdateSign,
            C0APacketAnimation,
            C18PacketSpectate,
            C08PacketPlayerBlockPlacement,
            C00Handshake,
            S02PacketLoginSuccess,
            S01PacketEncryptionRequest,
            S03PacketEnableCompression,
            S00PacketDisconnect,
            C00PacketLoginStart,
            C01PacketEncryptionResponse,
            S01PacketPong,
            S00PacketServerInfo,
            C01PacketPing,
            C00PacketServerQuery,
    };

    private static int nextPacketIndex;

    private final String shortName;

    private final int index;

    private final Context context;

    private Packets(String seargeName, String obfName, Context context)
    {
        super(seargeName, obfName);

        this.shortName = seargeName.substring(Math.max(seargeName.lastIndexOf('.'), seargeName.lastIndexOf('$')) + 1);
        this.index = Packets.nextPacketIndex++;
        Packets.packetMap.put(this.shortName, this);
        this.context = context;
    }

    public int getIndex()
    {
        return this.index;
    }

    public String getShortName()
    {
        return this.shortName;
    }

    public Context getContext()
    {
        return this.context;
    }

    public static int indexOf(String packetClassName)
    {
        for (Packets packet : Packets.packets)
        {
            if (packet.name.equals(packetClassName) || packet.shortName.equals(packetClassName) || packet.obf.equals(packetClassName))
            {
                return packet.index;
            }
        }

        return -1;
    }

    public static int count()
    {
        return Packets.nextPacketIndex;
    }

    /**
     * @param name
     */
    public static Packets getByName(String name)
    {
        return Packets.packetMap.get(name);
    }
}
