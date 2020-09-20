package com.adb.process.android;

import com.adb.command.andriodCmd.AndroidSystemCmd;
import com.adb.process.AndroidCtrl;

import java.io.IOException;

/**
 * C:\Users\admin>adb shell getprop
 * [DEVICE_PROVISIONED]: [1]
 * [aaudio.hw_burst_min_usec]: [2000]
 * [aaudio.mmap_exclusive_policy]: [2]
 * [aaudio.mmap_policy]: [1]
 * [af.fast_track_multiplier]: [1]
 * [audio.deep_buffer.media]: [true]
 * [audio.offload.buffer.size.kb]: [32]
 * [audio.offload.gapless.enabled]: [true]
 * [audio.offload.min.duration.secs]: [30]
 * [audio.offload.video]: [true]
 * [audio.sys.mute.latency.factor]: [2]
 * [audio.sys.noisy.broadcast.delay]: [500]
 * [audio.sys.offload.pstimeout.secs]: [3]
 * [audio.sys.routing.latency]: [0]
 * [av.offload.enable]: [true]
 * [cache.trigger]: [1]
 * [camera.disable_zsl_mode]: [true]
 * [config.disable_rtt]: [true]
 * [dalvik.vm.appimageformat]: [lz4]
 * [dalvik.vm.bg-dex2oat-threads]: [8]
 * [dalvik.vm.boot-dex2oat-threads]: [6]
 * [dalvik.vm.dex2oat-Xms]: [64m]
 * [dalvik.vm.dex2oat-Xmx]: [512m]
 * [dalvik.vm.dex2oat-max-image-block-size]: [524288]
 * [dalvik.vm.dex2oat-minidebuginfo]: [true]
 * [dalvik.vm.dex2oat-resolve-startup-strings]: [true]
 * [dalvik.vm.dex2oat-threads]: [6]
 * [dalvik.vm.dexopt.secondary]: [true]
 * [dalvik.vm.heapgrowthlimit]: [256m]
 * [dalvik.vm.heapmaxfree]: [8m]
 * [dalvik.vm.heapminfree]: [512k]
 * [dalvik.vm.heapsize]: [512m]
 * [dalvik.vm.heapstartsize]: [8m]
 * [dalvik.vm.heaptargetutilization]: [0.75]
 * [dalvik.vm.image-dex2oat-Xms]: [64m]
 * [dalvik.vm.image-dex2oat-Xmx]: [64m]
 * [dalvik.vm.isa.arm.features]: [default]
 * [dalvik.vm.isa.arm.variant]: [cortex-a75]
 * [dalvik.vm.isa.arm64.features]: [default]
 * [dalvik.vm.isa.arm64.variant]: [kryo300]
 * [dalvik.vm.minidebuginfo]: [true]
 * [dalvik.vm.usejit]: [true]
 * [dalvik.vm.usejitprofiles]: [true]
 * [debug.atrace.tags.enableflags]: [0]
 * [debug.egl.hw]: [0]
 * [debug.force_rtl]: [false]
 * [debug.mdpcomp.logs]: [0]
 * [debug.media.video.frc]: [false]
 * [debug.media.video.vpp]: [false]
 * [debug.media.vpp.enable]: [true]
 * [debug.power.monitor_tools]: [true]
 * [debug.sf.disable_backpressure]: [1]
 * [debug.sf.early_app_phase_offset_ns]: [500000]
 * [debug.sf.early_gl_app_phase_offset_ns]: [15000000]
 * [debug.sf.early_gl_phase_offset_ns]: [3000000]
 * [debug.sf.early_phase_offset_ns]: [500000]
 * [debug.sf.enable_gl_backpressure]: [1]
 * [debug.sf.enable_hwc_vds]: [1]
 * [debug.sf.high_fps_early_gl_phase_offset_ns]: [6500000]
 * [debug.sf.high_fps_early_phase_offset_ns]: [6100000]
 * [debug.sf.high_fps_late_app_phase_offset_ns]: [1000000]
 * [debug.sf.hw]: [0]
 * [debug.sf.latch_unsignaled]: [1]
 * [debug.sf.phase_offset_threshold_for_next_vsync_ns]: [6100000]
 * [debug.stagefright.ccodec]: [1]
 * [debug.stagefright.omx_default_rank]: [0]
 * [debug.stagefright.omx_default_rank.sw-audio]: [1]
 * [dev.bootcomplete]: [1]
 * [dev.mnt.blk.cache]: [sda]
 * [dev.mnt.blk.cust]: [sda]
 * [dev.mnt.blk.data]: [dm-8]
 * [dev.mnt.blk.dev.logfs]: [sda]
 * [dev.mnt.blk.metadata]: [sda]
 * [dev.mnt.blk.mnt.vendor.persist]: [sda]
 * [dev.mnt.blk.mnt.vendor.spunvm]: [sde]
 * [dev.mnt.blk.odm]: [dm-7]
 * [dev.mnt.blk.product]: [dm-5]
 * [dev.mnt.blk.root]: [dm-4]
 * [dev.mnt.blk.vendor]: [dm-6]
 * [dev.mnt.blk.vendor.bt_firmware]: [sde]
 * [dev.mnt.blk.vendor.dsp]: [sde]
 * [dev.mnt.blk.vendor.firmware_mnt]: [sde]
 * [dev.pm.dyn_samplingrate]: [1]
 * [drm.service.enabled]: [true]
 * [events.cpu]: [true]
 * [gsm.apn.sim.operator.numeric]: [,]
 * [gsm.current.phone-type]: [1,1]
 * [gsm.defaultpdpcontext.active]: [false]
 * [gsm.network.type]: [HSPAP,Unknown]
 * [gsm.operator.alpha]: [中国联通]
 * [gsm.operator.iso-country]: [cn]
 * [gsm.operator.isroaming]: [false,false]
 * [gsm.operator.numeric]: [46001]
 * [gsm.operator.orig.alpha]: [CHN-UNICOM]
 * [gsm.sim.operator.alpha]: [中国联通]
 * [gsm.sim.operator.iso-country]: [cn]
 * [gsm.sim.operator.numeric]: [46001]
 * [gsm.sim.operator.orig.alpha]: [CHN-UNICOM]
 * [gsm.sim.state]: [LOADED,ABSENT]
 * [gsm.version.baseband]: [r3.9326.2-0518_2337_8c9ed8e,r3.9326.2-0518_2337_8c9ed8e]
 * [gsm.version.ril-impl]: [Qualcomm RIL 1.0]
 * [hwservicemanager.ready]: [true]
 * [init.svc.adbd]: [running]
 * [init.svc.alarm-hal-1-0]: [running]
 * [init.svc.apexd]: [running]
 * [init.svc.apexd-bootstrap]: [stopped]
 * [init.svc.ashmemd]: [running]
 * [init.svc.audioserver]: [running]
 * [init.svc.audioshell_service]: [stopped]
 * [init.svc.batteryd]: [running]
 * [init.svc.batterysecret]: [running]
 * [init.svc.bootanim]: [stopped]
 * [init.svc.bpfloader]: [stopped]
 * [init.svc.cameraserver]: [running]
 * [init.svc.charge_logger]: [running]
 * [init.svc.checknv]: [stopped]
 * [init.svc.citsensor-hal-1-1]: [running]
 * [init.svc.cnss-daemon]: [running]
 * [init.svc.cnss_diag]: [running]
 * [init.svc.crashdata-sh]: [stopped]
 * [init.svc.display-color-hal-1-0]: [running]
 * [init.svc.displaycount]: [running]
 * [init.svc.displayfeature]: [running]
 * [init.svc.displayfeature-hal-1-0]: [running]
 * [init.svc.dpmQmiMgr]: [running]
 * [init.svc.dpmd]: [running]
 * [init.svc.drm]: [running]
 * [init.svc.eid-1-0]: [running]
 * [init.svc.fdpp]: [running]
 * [init.svc.feature_enabler_client]: [running]
 * [init.svc.flash_recovery]: [stopped]
 * [init.svc.gatekeeper-1-0]: [running]
 * [init.svc.gatekeeperd]: [running]
 * [init.svc.gnss_service]: [running]
 * [init.svc.gpu]: [running]
 * [init.svc.gsid]: [stopped]
 * [init.svc.health-hal-2-0]: [running]
 * [init.svc.hidl_memory]: [running]
 * [init.svc.hwservicemanager]: [running]
 * [init.svc.idmap2d]: [running]
 * [init.svc.incidentd]: [running]
 * [init.svc.installd]: [running]
 * [init.svc.iop-hal-2-0]: [running]
 * [init.svc.iorapd]: [stopped]
 * [init.svc.irsc_util]: [stopped]
 * [init.svc.keymaster-4-0]: [running]
 * [init.svc.keystore]: [running]
 * [init.svc.lmkd]: [running]
 * [init.svc.loc_launcher]: [running]
 * [init.svc.logd]: [running]
 * [init.svc.logd-auditctl]: [stopped]
 * [init.svc.logd-reinit]: [stopped]
 * [init.svc.mcd_init]: [stopped]
 * [init.svc.mcd_service]: [running]
 * [init.svc.mdnsd]: [running]
 * [init.svc.media]: [running]
 * [init.svc.media.swcodec]: [running]
 * [init.svc.mediadrm]: [running]
 * [init.svc.mediaextractor]: [running]
 * [init.svc.mediametrics]: [running]
 * [init.svc.mi_ic]: [stopped]
 * [init.svc.mi_thermald]: [running]
 * [init.svc.millet_binder]: [running]
 * [init.svc.millet_pkg]: [running]
 * [init.svc.millet_sig]: [running]
 * [init.svc.minidump64]: [stopped]
 * [init.svc.mioob-hal-1-0]: [running]
 * [init.svc.miui-early-boot]: [stopped]
 * [init.svc.miuibooster]: [running]
 * [init.svc.mlid]: [running]
 * [init.svc.modemservice]: [running]
 * [init.svc.mqsasd]: [running]
 * [init.svc.netd]: [running]
 * [init.svc.neuralnetworks_hal_service]: [running]
 * [init.svc.nqnfc_1_2_hal_service]: [running]
 * [init.svc.nqnfcinfo]: [stopped]
 * [init.svc.objectTracker]: [running]
 * [init.svc.panel-info-sh]: [stopped]
 * [init.svc.panorama]: [running]
 * [init.svc.perf-hal-2-0]: [running]
 * [init.svc.poweroffm64]: [stopped]
 * [init.svc.qcom-c_core-sh]: [stopped]
 * [init.svc.qcom-c_main-sh]: [stopped]
 * [init.svc.qcom-post-boot]: [stopped]
 * [init.svc.qcom-sh]: [stopped]
 * [init.svc.qseecom-service]: [running]
 * [init.svc.qseelogd]: [stopped]
 * [init.svc.qspmhal]: [running]
 * [init.svc.qspmsvc]: [running]
 * [init.svc.qteeconnector-hal-1-0]: [running]
 * [init.svc.qti_esepowermanager_service]: [running]
 * [init.svc.secureelement-hal]: [running]
 * [init.svc.sensorscal-hal-1-0]: [running]
 * [init.svc.servicemanager]: [running]
 * [init.svc.setlockstate]: [stopped]
 * [init.svc.shelld]: [running]
 * [init.svc.sla-service-hal-1-0]: [running]
 * [init.svc.soter-1-0]: [running]
 * [init.svc.spu_service]: [running]
 * [init.svc.statsd]: [running]
 * [init.svc.storaged]: [running]
 * [init.svc.surfaceflinger]: [running]
 * [init.svc.system_perf_init]: [stopped]
 * [init.svc.system_suspend]: [running]
 * [init.svc.tcpdump]: [running]
 * [init.svc.thermal-engine]: [running]
 * [init.svc.time_daemon]: [running]
 * [init.svc.tombstoned]: [running]
 * [init.svc.touchfeature-hal-1-0]: [running]
 * [init.svc.tui_comm-1-0]: [running]
 * [init.svc.ueventd]: [running]
 * [init.svc.urlhook]: [running]
 * [init.svc.usbd]: [stopped]
 * [init.svc.vendor-sensor-sh]: [stopped]
 * [init.svc.vibratorfeature-hal-1-0]: [running]
 * [init.svc.vndservicemanager]: [running]
 * [init.svc.vold]: [running]
 * [init.svc.wait_for_keymaster]: [stopped]
 * [init.svc.wfdhdcphalservice]: [running]
 * [init.svc.wfdvndservice]: [running]
 * [init.svc.wifi_mdlog_start]: [running]
 * [init.svc.wificond]: [running]
 * [init.svc.wifidisplayhalservice]: [running]
 * [init.svc.wireless-hal-1-0]: [running]
 * [init.svc.wpa_supplicant]: [running]
 * [init.svc.zygote]: [running]
 * [init.svc.zygote_secondary]: [running]
 * [keyguard.no_require_sim]: [true]
 * [log.tag.APM_AudioPolicyManager]: [D]
 * [log.tag.AudioPolicyManagerCustom]: [D]
 * [log.tag.stats_log]: [I]
 * [mcd.extra.params]: []
 * [media.aac_51_output_enabled]: [true]
 * [media.settings.xml]: [/vendor/etc/media_profiles_vendor.xml]
 * [media.stagefright.enable-aac]: [true]
 * [media.stagefright.enable-fma2dp]: [true]
 * [media.stagefright.enable-http]: [true]
 * [media.stagefright.enable-player]: [true]
 * [media.stagefright.enable-qcp]: [true]
 * [media.stagefright.enable-scan]: [true]
 * [media.stagefright.thumbnail.prefer_hw_codecs]: [true]
 * [miui.usb.dialog]: [1]
 * [mm.enable.smoothstreaming]: [true]
 * [mmp.enable.3g2]: [true]
 * [net.bt.name]: [Android]
 * [net.hostname]: [Mi10-xiaomishouji]
 * [net.qtaguid_enabled]: [1]
 * [net.tcp.2g_init_rwnd]: [10]
 * [net.tcp.default_init_rwnd]: [60]
 * [nfc.fw.downloadmode_force]: [0]
 * [nfc.initialized]: [true]
 * [persist.audio.button_jack.profile]: [volume]
 * [persist.audio.button_jack.switch]: [0]
 * [persist.audio.fluence.speaker]: [true]
 * [persist.audio.fluence.voicecall]: [true]
 * [persist.audio.fluence.voicerec]: [false]
 * [persist.audio.headset.plug.status]: [off]
 * [persist.backup.ntpServer]: ["0.pool.ntp.org"]
 * [persist.camera.privapp.list]: [org.codeaurora.snapcam]
 * [persist.dalvik.vm.dex2oat-threads]: [6]
 * [persist.data.df.agg.dl_pkt]: [10]
 * [persist.data.df.agg.dl_size]: [4096]
 * [persist.data.df.dev_name]: [rmnet_usb0]
 * [persist.data.df.dl_mode]: [5]
 * [persist.data.df.iwlan_mux]: [9]
 * [persist.data.df.mux_count]: [8]
 * [persist.data.df.ul_mode]: [5]
 * [persist.data.wda.enable]: [true]
 * [persist.debug.coresight.config]: [stm-events]
 * [persist.debug.wfd.enable]: [1]
 * [persist.enable_task_snapshots]: [false]
 * [persist.fuse_sdcard]: [true]
 * [persist.logd.size.crash]: [1M]
 * [persist.logd.size.radio]: [4M]
 * [persist.logd.size.system]: [4M]
 * [persist.miui.density_v2]: [440]
 * [persist.mm.enable.prefetch]: [true]
 * [persist.radio.autosms_cell1]: [114825989]
 * [persist.radio.autosms_cell2]: []
 * [persist.radio.autosms_dmok]: [yes]
 * [persist.radio.autosms_provision]: [true]
 * [persist.radio.default.data]: [0]
 * [persist.radio.default.voice]: [-1]
 * [persist.radio.display_mipi_cur]: [0]
 * [persist.radio.display_mipi_init_num]: [13]
 * [persist.radio.display_mipi_set_num]: [0]
 * [persist.radio.flexmap_type]: [none]
 * [persist.radio.goldencopy_flag]: [true]
 * [persist.radio.imei]: [866924048127116]
 * [persist.radio.imei1]: [866924048127116]
 * [persist.radio.imei2]: [866924048127124]
 * [persist.radio.meid]: [99001592456353]
 * [persist.radio.mtbf_flag]: [false]
 * [persist.radio.multisim.config]: [dsds]
 * [persist.radio.operating_mode]: [0]
 * [persist.radio.skhwc_matchres]: [MATCH]
 * [persist.radio.speech_codec]: []
 * [persist.rcs.supported]: [0]
 * [persist.rild.nitz_long_ons_0]: []
 * [persist.rild.nitz_long_ons_1]: []
 * [persist.rild.nitz_long_ons_2]: []
 * [persist.rild.nitz_long_ons_3]: []
 * [persist.rild.nitz_plmn]: []
 * [persist.rild.nitz_short_ons_0]: []
 * [persist.rild.nitz_short_ons_1]: []
 * [persist.rild.nitz_short_ons_2]: []
 * [persist.rild.nitz_short_ons_3]: []
 * [persist.rmnet.data.enable]: [true]
 * [persist.security.adbinput]: [1]
 * [persist.security.adbinstall]: [1]
 * [persist.sys.ai_preload_cloud]: [0]
 * [persist.sys.boot.reason]: []
 * [persist.sys.boot.reason.history]: [cold,1599062849
 * cold,1598614826
 * shutdown,userrequested,1596271454
 * cold,1592989611]
 * [persist.sys.dalvik.vm.lib.2]: [libart.so]
 * [persist.sys.device_provisioned]: [1]
 * [persist.sys.displayinset.top]: [0]
 * [persist.sys.enable_inputopts]: [true]
 * [persist.sys.enable_ioprefetch]: [false]
 * [persist.sys.enable_miui_booster]: [1]
 * [persist.sys.enable_pinfile]: [true]
 * [persist.sys.eyecare_cache]: [8]
 * [persist.sys.force_sw_gles]: [1]
 * [persist.sys.gps.fence]: [true]
 * [persist.sys.gps.lpp]: [0]
 * [persist.sys.gz.enable]: [true]
 * [persist.sys.hang]: [false]
 * [persist.sys.hang.logname]: []
 * [persist.sys.hardcoder.name]: [miui_booster]
 * [persist.sys.isolated_storage]: [true]
 * [persist.sys.labtest_flag]: [false]
 * [persist.sys.locale]: [zh-CN]
 * [persist.sys.mcd_config_file]: [/system/etc/mcd_default.conf]
 * [persist.sys.mem_cgated]: [1]
 * [persist.sys.mem_fgated]: [1]
 * [persist.sys.memctrl]: [on]
 * [persist.sys.mibridge_auth_uids]: [1000]
 * [persist.sys.miconnect.running]: [1]
 * [persist.sys.mispeed_auth_uids]: [10250]
 * [persist.sys.mitalk.enable]: [true]
 * [persist.sys.miuibooster.name]: [miui_booster]
 * [persist.sys.notification_rank]: [3]
 * [persist.sys.notification_ver]: [1]
 * [persist.sys.opt_accessibility]: [false]
 * [persist.sys.qseelogd]: [true]
 * [persist.sys.released]: [true]
 * [persist.sys.sc_allow_conn]: [true]
 * [persist.sys.sf.color_mode]: [0]
 * [persist.sys.sf.color_saturation]: [1.0]
 * [persist.sys.sf.native_mode]: [258]
 * [persist.sys.shutdown_state]: [2]
 * [persist.sys.smartcover_mode]: [0]
 * [persist.sys.strictmode.disable]: [true]
 * [persist.sys.support_detect_fc]: [false]
 * [persist.sys.support_fakecell]: [true]
 * [persist.sys.task_isolation]: [true]
 * [persist.sys.timezone]: [Asia/Shanghai]
 * [persist.sys.usb.config]: [adb]
 * [persist.sys.usb.ffbm-02.func]: [adb]
 * [persist.sys.watchdog_enhanced]: [true]
 * [persist.sys.wfd.virtual]: [0]
 * [persist.timed.enable]: [true]
 * [persist.vendor.camera.frontMain.vendorID]: [01]
 * [persist.vendor.camera.mi.dualcal.detail]: [0]
 * [persist.vendor.camera.mi.dualcal.state]: [0]
 * [persist.vendor.camera.mi.module.info]: [back_main=s5khmx;back_ultra=ov13b10;back_depth=gc02m1_FF;]
 * [persist.vendor.camera.mi.module.infoext]: [front_main=s5k3t2;back_macro2x=gc02m1;]
 * [persist.vendor.camera.rearDepth.vendorID]: [01]
 * [persist.vendor.camera.rearMacro2x.vendorID]: [01]
 * [persist.vendor.camera.rearMain.vendorID]: [03]
 * [persist.vendor.camera.rearUltra.vendorID]: [01]
 * [persist.vendor.dc_backlight.enable]: [false]
 * [persist.vendor.dc_backlight.threshold]: [440]
 * [persist.vendor.df.extcolor.proc]: [0]
 * [persist.vendor.dfps.level]: [90]
 * [persist.vendor.dpm.feature]: [1]
 * [persist.vendor.fod.modified.dc_status]: [false]
 * [persist.vendor.max.brightness]: [500]
 * [persist.vendor.power.dfps.level]: [0]
 * [persist.vendor.sys.cyclecount]: [43]
 * [persist.vendor.sys.fp.expolevel]: [0x80]
 * [persist.vendor.sys.fp.fod.large_field]: [0]
 * [persist.vendor.sys.fp.fod.location.X_Y]: [441,1808]
 * [persist.vendor.sys.fp.fod.size.width_height]: [197,197]
 * [persist.vendor.sys.fp.info]: [0xcf00004515000000]
 * [persist.vendor.sys.fp.module]: [Ofilm]
 * [persist.vendor.sys.fp.mulexposupport]: [0]
 * [persist.vendor.sys.fp.uid]: [47413254-37372E01-137C751A-76E70000]
 * [persist.vendor.sys.fp.vendor]: [goodix_fod]
 * [persist.vendor.sys.pay.fido]: [0058#0001]
 * [persist.vendor.sys.pay.ifaa]: [1]
 * [persist.vendor.sys.prechargefull]: [4799000]
 * [persist.vendor.sys.preresistance]: [62255]
 * [persist.vendor.sys.provision.status]: [true]
 * [persist.vm.stackdump.threshold]: [0]
 * [pm.dexopt.ab-ota]: [speed-profile]
 * [pm.dexopt.bg-dexopt]: [speed-profile]
 * [pm.dexopt.boot]: [verify]
 * [pm.dexopt.first-boot]: [quicken]
 * [pm.dexopt.inactive]: [verify]
 * [pm.dexopt.install]: [speed-profile]
 * [pm.dexopt.is_upgrade]: [false]
 * [pm.dexopt.shared]: [speed]
 * [qcom.hw.aac.encoder]: [true]
 * [qemu.hw.mainkeys]: [0]
 * [radio.dataroaming.enable.suffix.subid]: [true]
 * [ril.ecclist]: [112,000,08,110,120,119,118,122,911,999]
 * [ril.ecclist1]: [112,000,08,110,120,119,118,122,911,999]
 * [ril.fake_bs_flag0]: [FALSE:0]
 * [ril.limit_service_mnc]: [WCDMA_460]
 * [ril.mcc.mnc0]: [46001]
 * [ril.mcc.mnc1]: []
 * [ril.subscription.types]: [NV,RUIM]
 * [rild.libpath]: [/vendor/lib64/libril-qc-hal-qmi.so]
 * [ro.actionable_compatible_property.enabled]: [true]
 * [ro.adb.secure]: [1]
 * [ro.af.client_heap_size_kbyte]: [7168]
 * [ro.allow.mock.location]: [0]
 * [ro.apex.updatable]: [true]
 * [ro.audio.monitorRotation]: [true]
 * [ro.baseband]: [mdm]
 * [ro.bluetooth.library_name]: [libbluetooth_qti.so]
 * [ro.board.platform]: [kona]
 * [ro.boot.avb_version]: [1.1]
 * [ro.boot.baseband]: [mdm]
 * [ro.boot.boot_devices]: [soc/1d84000.ufshc]
 * [ro.boot.bootdevice]: [1d84000.ufshc]
 * [ro.boot.bootreason]: [cold]
 * [ro.boot.console]: [ttyMSM0]
 * [ro.boot.cpuid]: [0xffe0dfe8]
 * [ro.boot.dp]: [0x0]
 * [ro.boot.dtb_idx]: [0]
 * [ro.boot.dtbo_idx]: [8]
 * [ro.boot.dynamic_partitions]: [true]
 * [ro.boot.flash.locked]: [1]
 * [ro.boot.hardware]: [qcom]
 * [ro.boot.hwc]: [CN]
 * [ro.boot.hwlevel]: [MP]
 * [ro.boot.hwversion]: [2.9.0]
 * [ro.boot.keymaster]: [1]
 * [ro.boot.memcg]: [1]
 * [ro.boot.oled_panel_id]: [0B]
 * [ro.boot.oled_pmic_id]: [0B]
 * [ro.boot.oled_wp]: [01f3020909030104]
 * [ro.boot.profile_vendor_id]: [0A]
 * [ro.boot.ramdump]: [disable]
 * [ro.boot.secureboot]: [1]
 * [ro.boot.serialno]: [c447b522]
 * [ro.boot.usbcontroller]: [a600000.dwc3]
 * [ro.boot.vbmeta.avb_version]: [1.0]
 * [ro.boot.vbmeta.device_state]: [locked]
 * [ro.boot.vbmeta.digest]: [9cecfc12471a38ed3880ef414fbba06301c36e91be63da527bdf445833f4a8e3]
 * [ro.boot.vbmeta.hash_alg]: [sha256]
 * [ro.boot.vbmeta.invalidate_on_error]: [yes]
 * [ro.boot.vbmeta.size]: [9216]
 * [ro.boot.verifiedbootstate]: [green]
 * [ro.boot.veritymode]: [enforcing]
 * [ro.bootimage.build.date]: [Tue May 19 02:54:33 CST 2020]
 * [ro.bootimage.build.date.utc]: [1589828073]
 * [ro.bootimage.build.fingerprint]: [Xiaomi/umi/umi:10/QKQ1.191117.002/V11.0.25.0.QJBCNXM:user/release-keys]
 * [ro.bootloader]: [unknown]
 * [ro.bootmode]: [unknown]
 * [ro.build.ab_update]: [false]
 * [ro.build.characteristics]: [nosdcard]
 * [ro.build.date]: [Tue May 19 01:37:31 CST 2020]
 * [ro.build.date.utc]: [1589823451]
 * [ro.build.description]: [umi-user 10 QKQ1.191117.002 V11.0.25.0.QJBCNXM release-keys]
 * [ro.build.display.id]: [QKQ1.191117.002 test-keys]
 * [ro.build.fingerprint]: [Xiaomi/umi/umi:10/QKQ1.191117.002/V11.0.25.0.QJBCNXM:user/release-keys]
 * [ro.build.flavor]: [qssi-user]
 * [ro.build.hardware.version]: [V1]
 * [ro.build.host]: [c5-miui-ota-bd071.bj]
 * [ro.build.id]: [QKQ1.191117.002]
 * [ro.build.keys]: [test-keys]
 * [ro.build.product]: [umi]
 * [ro.build.system_root_image]: [false]
 * [ro.build.tags]: [release-keys]
 * [ro.build.type]: [user]
 * [ro.build.user]: [builder]
 * [ro.build.version.all_codenames]: [REL]
 * [ro.build.version.base_os]: []
 * [ro.build.version.codename]: [REL]
 * [ro.build.version.incremental]: [V11.0.25.0.QJBCNXM]
 * [ro.build.version.min_supported_target_sdk]: [23]
 * [ro.build.version.preview_sdk]: [0]
 * [ro.build.version.preview_sdk_fingerprint]: [REL]
 * [ro.build.version.release]: [10]
 * [ro.build.version.sdk]: [29]
 * [ro.build.version.security_patch]: [2020-04-01]
 * [ro.carrier]: [unknown]
 * [ro.carrier.name]: [ct]
 * [ro.com.android.dataroaming]: [false]
 * [ro.com.android.mobiledata]: [false]
 * [ro.config.alarm_alert]: [Alarm_Classic.ogg]
 * [ro.config.elder-ringtone]: [Angel.mp3]
 * [ro.config.gnss.support]: [true]
 * [ro.config.media_vol_default]: [10]
 * [ro.config.notification_sound]: [pixiedust.ogg]
 * [ro.config.ringtone]: [Ring_Synth_04.ogg]
 * [ro.config.sms_delivered_sound]: [MessageComplete.ogg]
 * [ro.config.sms_received_sound]: [FadeIn.ogg]
 * [ro.config.vc_call_vol_steps]: [11]
 * [ro.control_privapp_permissions]: [enforce]
 * [ro.crypto.allow_encrypt_override]: [true]
 * [ro.crypto.state]: [encrypted]
 * [ro.crypto.type]: [file]
 * [ro.crypto.volume.filenames_mode]: [aes-256-cts]
 * [ro.dalvik.vm.native.bridge]: [0]
 * [ro.debuggable]: [0]
 * [ro.device_owner]: [false]
 * [ro.fota.oem]: [Xiaomi]
 * [ro.frp.pst]: [/dev/block/bootdevice/by-name/frp]
 * [ro.gfx.driver.0]: [com.xiaomi.ugd]
 * [ro.gfx.driver.1]: [com.qualcomm.qti.gpudrivers.sm8250.api29]
 * [ro.hardware]: [qcom]
 * [ro.hardware.egl]: [adreno]
 * [ro.hardware.fp.fod]: [true]
 * [ro.hardware.keystore_desede]: [true]
 * [ro.hardware.vulkan]: [adreno]
 * [ro.hwui.drop_shadow_cache_size]: [6]
 * [ro.hwui.gradient_cache_size]: [1]
 * [ro.hwui.layer_cache_size]: [48]
 * [ro.hwui.path_cache_size]: [32]
 * [ro.hwui.r_buffer_cache_size]: [8]
 * [ro.hwui.text_large_cache_height]: [1024]
 * [ro.hwui.text_large_cache_width]: [2048]
 * [ro.hwui.text_small_cache_height]: [1024]
 * [ro.hwui.text_small_cache_width]: [1024]
 * [ro.hwui.texture_cache_flushrate]: [0.4]
 * [ro.hwui.texture_cache_size]: [72]
 * [ro.hwui.use_vulkan]: []
 * [ro.iorapd.enable]: [false]
 * [ro.kernel.qemu.gles]: [0]
 * [ro.lmk.kill_heaviest_task]: [true]
 * [ro.lmk.use_minfree_levels]: [true]
 * [ro.logd.size]: [2M]
 * [ro.logd.size.stats]: [64K]
 * [ro.malloc.impl]: [jemalloc]
 * [ro.mi.development]: [false]
 * [ro.minui.pixel_format]: [RGBX_8888]
 * [ro.miui.build.region]: [cn]
 * [ro.miui.cust_hardware]: [V1]
 * [ro.miui.cust_variant]: [cn_chinatelecom]
 * [ro.miui.has_cust_partition]: [true]
 * [ro.miui.has_gmscore]: [1]
 * [ro.miui.has_handy_mode_sf]: [1]
 * [ro.miui.has_real_blur]: [1]
 * [ro.miui.has_security_keyboard]: [1]
 * [ro.miui.mcc]: [9460]
 * [ro.miui.mnc]: [9003]
 * [ro.miui.notch]: [1]
 * [ro.miui.pm.install.buffer.size]: [49152]
 * [ro.miui.pm.movedtodata.apps]: [com.google.android.apps.photos,com.google.android.apps.docs,com.google.android.music,com.google.android.videos,com.google.android.apps.tachyon]
 * [ro.miui.region]: [CN]
 * [ro.miui.restrict_imei]: [1]
 * [ro.miui.support_miui_ime_bottom]: [1]
 * [ro.miui.ui.fonttype]: [mipro]
 * [ro.miui.ui.version.code]: [9]
 * [ro.miui.ui.version.name]: [V11]
 * [ro.miui.version.code_time]: [1575475200]
 * [ro.netflix.bsp_rev]: [Q8250-19134-1]
 * [ro.nfc.port]: [I2C]
 * [ro.odm.build.date]: [Tue May 19 02:54:33 CST 2020]
 * [ro.odm.build.date.utc]: [1589828073]
 * [ro.odm.build.fingerprint]: [Xiaomi/umi/umi:10/QKQ1.191117.002/V11.0.25.0.QJBCNXM:user/release-keys]
 * [ro.oem_unlock_supported]: [1]
 * [ro.opengles.version]: [196610]
 * [ro.postinstall.fstab.prefix]: [/system]
 * [ro.product.board]: [umi]
 * [ro.product.brand]: [Xiaomi]
 * [ro.product.build.date]: [Tue May 19 01:37:31 CST 2020]
 * [ro.product.build.date.utc]: [1589823451]
 * [ro.product.build.fingerprint]: [qti/qssi/qssi:10/QKQ1.191117.002/V11.0.25.0.QJBCNXM:user/release-keys]
 * [ro.product.build.id]: [QKQ1.191117.002]
 * [ro.product.build.tags]: [release-keys]
 * [ro.product.build.type]: [user]
 * [ro.product.build.version.incremental]: [V11.0.25.0.QJBCNXM]
 * [ro.product.build.version.release]: [10]
 * [ro.product.build.version.sdk]: [29]
 * [ro.product.cert]: [M2001J2C]
 * [ro.product.cpu.abi]: [arm64-v8a]
 * [ro.product.cpu.abilist]: [arm64-v8a,armeabi-v7a,armeabi]
 * [ro.product.cpu.abilist32]: [armeabi-v7a,armeabi]
 * [ro.product.cpu.abilist64]: [arm64-v8a]
 * [ro.product.cuptsm]: [XIAOMI|ESE|02|01]
 * [ro.product.device]: [umi]
 * [ro.product.first_api_level]: [29]
 * [ro.product.locale]: [zh-CN]
 * [ro.product.manufacturer]: [Xiaomi]
 * [ro.product.model]: [Mi 10]
 * [ro.product.name]: [umi]
 * [ro.product.odm.brand]: [Xiaomi]
 * [ro.product.odm.device]: [umi]
 * [ro.product.odm.manufacturer]: [Xiaomi]
 * [ro.product.odm.model]: [Mi 10]
 * [ro.product.odm.name]: [umi]
 * [ro.product.product.brand]: [qti]
 * [ro.product.product.device]: [qssi]
 * [ro.product.product.manufacturer]: [QUALCOMM]
 * [ro.product.product.model]: [qssi system image for arm64]
 * [ro.product.product.name]: [qssi]
 * [ro.product.property_source_order]: [odm,vendor,product,product_services,system]
 * [ro.product.system.brand]: [qti]
 * [ro.product.system.device]: [qssi]
 * [ro.product.system.manufacturer]: [QUALCOMM]
 * [ro.product.system.model]: [qssi system image for arm64]
 * [ro.product.system.name]: [qssi]
 * [ro.product.vendor.brand]: [Xiaomi]
 * [ro.product.vendor.device]: [umi]
 * [ro.product.vendor.manufacturer]: [Xiaomi]
 * [ro.product.vendor.model]: [Mi 10]
 * [ro.product.vendor.name]: [umi]
 * [ro.property_service.version]: [2]
 * [ro.qc.sdk.audio.fluencetype]: [none]
 * [ro.qc.sdk.audio.ssr]: [false]
 * [ro.revision]: [0]
 * [ro.ril.factory_id]: [1]
 * [ro.ril.miui.imei0]: [866924048127116]
 * [ro.ril.miui.imei1]: [866924048127124]
 * [ro.ril.nal]: []
 * [ro.ril.oem.imei]: [866924048127116]
 * [ro.ril.oem.imei1]: [866924048127116]
 * [ro.ril.oem.imei2]: [866924048127124]
 * [ro.ril.oem.meid]: [99001592456353]
 * [ro.ril.oem.psno]: [26902/20T501010]
 * [ro.ril.oem.sno]: [24023F021789]
 * [ro.ril.operator]: []
 * [ro.ril.region]: []
 * [ro.rom.zone]: [1]
 * [ro.secure]: [1]
 * [ro.secureboot.devicelock]: [1]
 * [ro.secureboot.lockstate]: [locked]
 * [ro.serialno]: [c447b522]
 * [ro.sf.lcd_density]: [440]
 * [ro.surface_flinger.has_HDR_display]: [true]
 * [ro.surface_flinger.has_wide_color_display]: [true]
 * [ro.surface_flinger.protected_contents]: [true]
 * [ro.surface_flinger.use_color_management]: [true]
 * [ro.surface_flinger.wcg_composition_dataspace]: [143261696]
 * [ro.system.build.date]: [Tue May 19 01:37:31 CST 2020]
 * [ro.system.build.date.utc]: [1589823451]
 * [ro.system.build.fingerprint]: [qti/qssi/qssi:10/QKQ1.191117.002/V11.0.25.0.QJBCNXM:user/release-keys]
 * [ro.system.build.id]: [QKQ1.191117.002]
 * [ro.system.build.tags]: [release-keys]
 * [ro.system.build.type]: [user]
 * [ro.system.build.version.incremental]: [V11.0.25.0.QJBCNXM]
 * [ro.system.build.version.release]: [10]
 * [ro.system.build.version.sdk]: [29]
 * [ro.telephony.call_ring.multiple]: [false]
 * [ro.telephony.default_cdma_sub]: [0]
 * [ro.telephony.default_network]: [22,22]
 * [ro.treble.enabled]: [true]
 * [ro.vendor.all_modes.colorpick_adjust]: [true]
 * [ro.vendor.bcbc.enable]: [true]
 * [ro.vendor.build.date]: [Tue May 19 02:54:33 CST 2020]
 * [ro.vendor.build.date.utc]: [1589828073]
 * [ro.vendor.build.fingerprint]: [Xiaomi/umi/umi:10/QKQ1.191117.002/V11.0.25.0.QJBCNXM:user/release-keys]
 * [ro.vendor.build.security_patch]: [2020-04-01]
 * [ro.vendor.cabc.enable]: [false]
 * [ro.vendor.colorpick_adjust]: [true]
 * [ro.vendor.df.effect.conflict]: [1]
 * [ro.vendor.dfps.enable]: [false]
 * [ro.vendor.display.default_fps]: [60]
 * [ro.vendor.display.type]: [oled]
 * [ro.vendor.fod.dimlayer.enable]: [true]
 * [ro.vendor.gcp.enable]: [1]
 * [ro.vendor.histogram.enable]: [true]
 * [ro.vendor.miui.cust_hardware]: [V1]
 * [ro.vendor.miui.cust_variant]: [cn_chinatelecom]
 * [ro.vendor.miui.mcc]: [9460]
 * [ro.vendor.miui.mnc]: [9003]
 * [ro.vendor.miui.region]: [CN]
 * [ro.vendor.qti.va_aosp.support]: [1]
 * [ro.vendor.qti.va_odm.support]: [1]
 * [ro.vendor.se.type]: [eSE,HCE,UICC]
 * [ro.vendor.soft_backlight.enable]: [true]
 * [ro.vendor.touchfeature.type]: [7]
 * [ro.vendor.whitepoint_calibration_enable]: [false]
 * [ro.vendor.xiaomi.bl.poll]: [true]
 * [ro.vndk.version]: [29]
 * [ro.wifi.channels]: []
 * [ro.zygote]: [zygote64_32]
 * [security.perf_harden]: [1]
 * [selinux.restorecon_recursive]: [/data/misc_ce/0]
 * [service.bootanim.exit]: [1]
 * [service.sf.present_timestamp]: [1]
 * [sys.boot.reason]: [cold]
 * [sys.boot.reason.last]: [reboot,]
 * [sys.boot_completed]: [1]
 * [sys.displayfeature_hidl]: [true]
 * [sys.dump_progress]: [1000]
 * [sys.haptic.down]: [5,2]
 * [sys.haptic.down.normal]: [2]
 * [sys.haptic.down.strong]: [5]
 * [sys.haptic.down.weak]: [0]
 * [sys.haptic.flick]: [5,2]
 * [sys.haptic.flick.light]: [7,2]
 * [sys.haptic.hold]: [4,0]
 * [sys.haptic.infinitelevel]: [true]
 * [sys.haptic.long.press]: [0,1]
 * [sys.haptic.mesh.heavy]: [8,2]
 * [sys.haptic.mesh.light]: [5,1]
 * [sys.haptic.mesh.normal]: [5,2]
 * [sys.haptic.motor]: [linear]
 * [sys.haptic.pickup]: [2,2]
 * [sys.haptic.popup.light]: [6,1]
 * [sys.haptic.popup.normal]: [6,2]
 * [sys.haptic.runin]: [13]
 * [sys.haptic.scroll.edge]: [7,0]
 * [sys.haptic.switch]: [9,2]
 * [sys.haptic.tap.light]: [5,2]
 * [sys.haptic.tap.normal]: [3,2]
 * [sys.haptic.trigger.drawer]: [2,0]
 * [sys.hardcoder.registered]: [true]
 * [sys.is_mem_low_level]: [0]
 * [sys.isolated_storage_snapshot]: [true]
 * [sys.kernel.firstboot]: [1599062867975]
 * [sys.keyguard.screen_off_by_lid]: [false]
 * [sys.logbootcomplete]: [1]
 * [sys.miui.ndcd]: [off]
 * [sys.miui.runtime.reboot]: [0]
 * [sys.miui.screenshot]: [false]
 * [sys.miui.shutdown.waittime]: [500]
 * [sys.miui.user_authenticated]: [true]
 * [sys.mtp.device_type]: [2]
 * [sys.net.support.netprio]: [true]
 * [sys.oem_unlock_allowed]: [0]
 * [sys.power.starttimes]: [1]
 * [sys.qca1530]: [detect]
 * [sys.rescue_boot_count]: [1]
 * [sys.retaildemo.enabled]: [0]
 * [sys.sysctl.extra_free_kbytes]: [29615]
 * [sys.sysctl.tcp_def_init_rwnd]: [60]
 * [sys.system_server.start_count]: [1]
 * [sys.system_server.start_elapsed]: [7733]
 * [sys.system_server.start_uptime]: [7733]
 * [sys.tp.grip_enable]: [0]
 * [sys.usb.config]: [adb]
 * [sys.usb.configfs]: [1]
 * [sys.usb.controller]: [a600000.dwc3]
 * [sys.usb.ffs.ready]: [1]
 * [sys.usb.state]: [adb]
 * [sys.use_memfd]: [false]
 * [sys.user.0.ce_available]: [true]
 * [sys.vendor.shutdown.waittime]: [500]
 * [sys.wifitracing.started]: [1]
 * [telephony.lteOnCdmaDevice]: [1]
 * [tunnel.audio.encode]: [true]
 * [use.voice.path.for.pcm.voip]: [true]
 * [vendor.camera.sensor.frontMain.fuseID]: [sunn001200F1C7B605F800000000000000000000000000000000000000000000]
 * [vendor.camera.sensor.rearDepth.fuseID]: [sunn0018153E4130303030333200000000000000000000000000000000000000]
 * [vendor.camera.sensor.rearMacro2x.fuseID]: [sunn001809091530303031383100000000000000000000000000000000000000]
 * [vendor.camera.sensor.rearMain.fuseID]: [semc003000C84B7E8D98FFFFFFFFFFFFFFFFFF00000000000000000000000000]
 * [vendor.camera.sensor.rearUltra.fuseID]: [sunn00321F130B01000A19020A00090305162C01000000000000000000000000]
 * [vendor.gralloc.disable_ubwc]: [0]
 * [vendor.hbm.enable]: [true]
 * [vendor.sys.listeners.registered]: [true]
 * [vendor.sys.rpmb_state]: [23]
 * [vold.has_adoptable]: [1]
 * [vold.has_quota]: [1]
 * [vold.has_reserved]: [1]
 * [vold.post_fs_data_done]: [1]
 * [wifi.interface]: [wlan0]
 */
public class AndroidSystem extends IAndroid{

    public AndroidSystem(AndroidCtrl context) {
        super(context);
    }

    AndroidSystemCmd cmd = new AndroidSystemCmd();

    /**
     * 系统版本
     * @return
     */
    public String SystemVersion(){
        try {
            return context.exec(cmd.systemVersion());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    /**
     * SDK版本
     * @return
     */
    public String SDKVersion(){
        try {
            return context.exec(cmd.SDKVersion());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }


    public String date(){
        try {
            return context.exec(cmd.date());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    public String location(){
        try {
            return context.exec(cmd.locationInfo());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 设备型号
     * @return
     */
    public String devBrand(){
        try {
            return context.exec(cmd.devBrand());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    /**
     * 设备型号，如：Nexus 5、Mi 10
     * @return
     */
    public String devModel(){
        try {
            return context.exec(cmd.devModel());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public String devIMEI(){
        try {
            return context.exec(cmd.devIMEI());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    /**
     *
     *  Android 10测试可行
     *  获取当前正在运行进程
     * @param grep 为空时返回全部
     * @return
     */
    public String listProcess(String grep){
        try{
            return context.exec(cmd.listProcess(grep));
        }catch (Exception e){
            e.printStackTrace();
        }

        return "";
    }

    /**
     * Android 10 返回键测试可行
     *
     * 虚拟按键控制
     * @param androidKeyEvent 有效参数见：lib.process.android.AndroidKeyEvent
     * @return
     */
    public boolean inputKeyEvent(int androidKeyEvent){
        try{
            context.exec(cmd.inputKeyEvent(androidKeyEvent));
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }

        return false;
    }

}
