package com.facebook.common.dextricks;

public class Experiments {
    public static final String ANDROID_ABORTHOOKS_ENABLED = "android_aborthooks_enabled";
    public static final String ANDROID_ENABLE_MEMORY_DEX2OAT_HOOK = "android_dex2oat_memory_backport_gk";
    public static final String ANDROID_SMART_GC_USE_NEW_DISTRACT_COORDINATOR = "android_configure_smart_gc_use_new_distract_coord";
    public static final String ANDROID_TRY_TO_RECOVER_FROM_ADDDEX_IO_EXCEPTION = "android_try_to_recover_from_adddex_io_exception";
    public static final String APPLICATION_CLASS_PRELOADING = "messenger_application_class_preloading";
    public static final String ART_DISABLE_VERIFIER_FILENAME = "gk_disable_dex_verifier_enabled";
    public static final String ART_DISABLE_VERIFIER_NAME = "gk_disable_dex_verifier";
    public static final String CHECK_TRACER_TRACING = "android_check_tracer_tracing_gk";
    public static final String CREATE_PROGRESS_THREAD_EARLY = "android_reliability_experiments_create_thread_early";
    public static final String DEX_HASH_LOOKUP_ENABLED = "android_diskio_hashedclasslookup_enabled";
    public static final String DISABLE_DEX_COLLISION_CHECK = "disable_dex_collision_check";
    public static final String DISABLE_DEX_ISUPTODATE_CHECK = "disable_dex_isuptodate_check";
    public static final String DISABLE_DEX_VERIFIER = "disable_dex_verifier";
    public static final String DISABLE_JIT_GK_ENABLED_FILENAME = "android_disable_jit_gk_enabled";
    public static final String DISABLE_JIT_GK_NAME = "android_disable_jit_gk";
    public static final String DISABLE_JIT_PROFILER_GK_ENABLED_FILENAME = "android_disable_jit_profiler_gk_enabled";
    public static final String DISABLE_JIT_PROFILER_GK_NAME = "android_disable_jit_profiler_gk";
    public static final String DISABLE_MONITOR_VISITLOCKS = "disable_monitor_visitlocks";
    public static final String DO_NOT_RESTART_PROCESS_AFTER_DEX_OPT = "android_do_not_restart_process_after_dex_opt";
    public static final String ENABLED_MLOCK_CODE = "enabled_mlock_code";
    public static final String ENABLED_MLOCK_CODE_PRIORITY = "enabled_mlock_code_priority";
    public static final String ENABLED_MPROTECT_CODE = "enabled_mprotect_code";
    public static final String ENABLED_MPROTECT_CODE_BACKGROUND = "enabled_mprotect_code_background";
    public static final String ENABLED_MPROTECT_CODE_BACKGROUND_SECONDARY_PROCESS = "enabled_mprotect_code_background_secondary_process";
    public static final String ENABLE_IO_LOGGING_ACROSS_ADD_DEXES = "fb4a_enable_io_logging_across_add_dexes";
    public static final String ENABLE_JIT_GK_ENABLED_FILENAME = "android_enable_jit_gk_enabled";
    public static final String ENABLE_JIT_GK_NAME = "android_enable_jit_gk";
    public static final String ENABLE_MADVISE_RAND = "madvise_rand_enabled";
    public static final String ENABLE_TURBO_LOADER = "enable_turbo_loader";
    public static final String FRESCO_O3_GK_ENABLED_FILENAME = "fb4a_fresco_lib_o3_enabled";
    public static final String FRESCO_O3_GK_NAME = "fb4a_fresco_lib_o3";
    public static final String FRESCO_OS_GK_ENABLED_FILENAME = "fb4a_fresco_lib_os_enabled";
    public static final String FRESCO_OS_GK_NAME = "fb4a_fresco_lib_os";
    public static final String MDCLAN_BLACKLIST_GK_ENABLED_FILENAME = "multidexclassloader_artnative_modelspecific_blacklisted";
    public static final String MDCLAN_BLACKLIST_GK_NAME = "multidexclassloader_artnative_modelspecific";
    public static final int MDCL_SELECTOR_CONTROL = 0;
    public static final int MDCL_SELECTOR_MDCLAN_JUMP = 2;
    public static final int MDCL_SELECTOR_MDCLAN_TRAP = 1;
    public static final String MLOCK_CPU_PRIORITY = "mlock_cpu_priority";
    public static final String MLOCK_INCREASE_MLOCKLIMIT_TO_LOCKSIZE = "mlock_increasing_lock_to_locksize";
    public static final String MLOCK_INCREASE_MLOCKLIMIT_TO_MAX = "mlock_increasing_lock_to_max";
    public static final String MLOCK_ONLY_EXECUTABLE = "mlock_only_executable";
    public static final String MLOCK_SIZE_MB = "mlock_size_mb";
    public static final String MONITOR_MAIN_LOOPER = "android_reliability_experiments_monitor_main_looper";
}
