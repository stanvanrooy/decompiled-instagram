package p000X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.03s  reason: invalid class name and case insensitive filesystem */
public final class C027303s implements FilenameFilter {
    public final boolean accept(File file, String str) {
        return str.endsWith("_native");
    }
}
