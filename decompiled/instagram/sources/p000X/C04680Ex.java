package p000X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.0Ex  reason: invalid class name and case insensitive filesystem */
public final class C04680Ex implements FileFilter {
    public final /* synthetic */ C04440Dz A00;
    public final /* synthetic */ C04700Ez A01;

    public C04680Ex(C04700Ez r1, C04440Dz r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final boolean accept(File file) {
        String name = file.getName();
        C04440Dz r1 = this.A00;
        if ((name.startsWith(r1.A00) || r1 == C04440Dz.LARGE_REPORT) && file.getName().contains("suppl_") && file.getName().endsWith("_prop.txt")) {
            return true;
        }
        return false;
    }
}
