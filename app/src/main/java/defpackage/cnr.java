package defpackage;

import com.autonavi.minimap.auidebugger.boommenu.Types.PlaceType;
import java.lang.reflect.Array;

/* renamed from: cnr reason: default package */
/* compiled from: EndLocationsFactory */
public final class cnr {
    public static int[][] a(PlaceType placeType, int i, int i2, int i3, int i4) {
        PlaceType placeType2 = placeType;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{9, 2});
        if (placeType2.equals(PlaceType.CIRCLE_1_1)) {
            int i8 = i7 / 2;
            iArr[0][0] = (i5 / 2) - i8;
            iArr[0][1] = (i6 / 2) - i8;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_2_1)) {
            int i9 = i7 / 2;
            iArr[0][0] = (i5 / 3) - i9;
            int i10 = (i6 / 2) - i9;
            iArr[0][1] = i10;
            iArr[1][0] = ((i5 * 2) / 3) - i9;
            iArr[1][1] = i10;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_2_2)) {
            int i11 = i7 / 2;
            int i12 = (i5 / 2) - i11;
            iArr[0][0] = i12;
            iArr[0][1] = (i6 / 3) - i11;
            iArr[1][0] = i12;
            iArr[1][1] = ((i6 * 2) / 3) - i11;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_3_1)) {
            int i13 = (i7 * 9) / 8;
            int i14 = i5 / 2;
            int i15 = i7 / 2;
            iArr[0][0] = (i14 - i13) - i15;
            int i16 = (i6 / 2) - i15;
            iArr[0][1] = i16;
            iArr[1][0] = i14 - i15;
            iArr[1][1] = i16;
            iArr[2][0] = (i14 + i13) - i15;
            iArr[2][1] = i16;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_3_2)) {
            int i17 = (i7 * 9) / 8;
            int i18 = i7 / 2;
            int i19 = (i5 / 2) - i18;
            iArr[0][0] = i19;
            int i20 = i6 / 2;
            iArr[0][1] = (i20 - i17) - i18;
            iArr[1][0] = i19;
            iArr[1][1] = i20 - i18;
            iArr[2][0] = i19;
            iArr[2][1] = (i20 + i17) - i18;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_3_3)) {
            int i21 = i5 / 6;
            int sqrt = (int) (((double) (i21 * 2)) / Math.sqrt(3.0d));
            int i22 = i5 / 2;
            int i23 = i7 / 2;
            iArr[0][0] = i22 - i23;
            int i24 = i6 / 2;
            iArr[0][1] = (i24 - sqrt) - i23;
            iArr[1][0] = (i22 - i21) - i23;
            int i25 = (i24 + (sqrt / 2)) - i23;
            iArr[1][1] = i25;
            iArr[2][0] = (i22 + i21) - i23;
            iArr[2][1] = i25;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_3_4)) {
            int i26 = i5 / 6;
            int sqrt2 = (int) (((double) (i26 * 2)) / Math.sqrt(3.0d));
            int i27 = i5 / 2;
            int i28 = i7 / 2;
            iArr[0][0] = i27 - i28;
            int i29 = i6 / 2;
            iArr[0][1] = (sqrt2 + i29) - i28;
            iArr[1][0] = (i27 - i26) - i28;
            int i30 = (i29 - (sqrt2 / 2)) - i28;
            iArr[1][1] = i30;
            iArr[2][0] = (i27 + i26) - i28;
            iArr[2][1] = i30;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_4_1)) {
            int i31 = i7 / 2;
            int i32 = (i5 / 3) - i31;
            iArr[0][0] = i32;
            int i33 = i6 / 2;
            int i34 = i5 / 6;
            int i35 = (i33 - i34) - i31;
            iArr[0][1] = i35;
            int i36 = ((i5 * 2) / 3) - i31;
            iArr[1][0] = i36;
            iArr[1][1] = i35;
            iArr[2][0] = i32;
            int i37 = (i33 + i34) - i31;
            iArr[2][1] = i37;
            iArr[3][0] = i36;
            iArr[3][1] = i37;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_4_2)) {
            double sqrt3 = Math.sqrt(2.0d);
            int i38 = i5 / 2;
            int i39 = i7 / 2;
            int i40 = i38 - i39;
            iArr[0][0] = i40;
            int i41 = i6 / 2;
            double d = (double) i41;
            double d2 = ((double) (i5 / 3)) / sqrt3;
            double d3 = (double) i39;
            iArr[0][1] = (int) ((d - d2) - d3);
            double d4 = (double) i38;
            iArr[1][0] = (int) ((d4 + d2) - d3);
            int i42 = i41 - i39;
            iArr[1][1] = i42;
            iArr[2][0] = i40;
            iArr[2][1] = (int) ((d + d2) - d3);
            iArr[3][0] = (int) ((d4 - d2) - d3);
            iArr[3][1] = i42;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_5_1)) {
            double sqrt4 = Math.sqrt(3.0d);
            int i43 = i6 / 2;
            int i44 = i7 / 2;
            iArr[0][0] = (i5 / 4) - i44;
            int i45 = i43 - i44;
            iArr[0][1] = i45;
            iArr[1][0] = (i5 / 2) - i44;
            iArr[1][1] = i45;
            int i46 = i5 * 3;
            iArr[2][0] = (i46 / 4) - i44;
            iArr[2][1] = i45;
            iArr[3][0] = (i46 / 8) - i44;
            int i47 = (int) ((((double) i43) + ((sqrt4 / 8.0d) * ((double) i5))) - ((double) i44));
            iArr[3][1] = i47;
            iArr[4][0] = ((i5 * 5) / 8) - i44;
            iArr[4][1] = i47;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_5_2)) {
            double sqrt5 = Math.sqrt(3.0d);
            int i48 = i6 / 2;
            int i49 = i5 * 3;
            int i50 = i7 / 2;
            iArr[0][0] = (i49 / 8) - i50;
            int i51 = i48 - i50;
            iArr[0][1] = i51;
            iArr[1][0] = ((i5 * 5) / 8) - i50;
            iArr[1][1] = i51;
            iArr[2][0] = (i5 / 4) - i50;
            int i52 = (int) ((((double) i48) + ((sqrt5 / 8.0d) * ((double) i5))) - ((double) i50));
            iArr[2][1] = i52;
            iArr[3][0] = (i5 / 2) - i50;
            iArr[3][1] = i52;
            iArr[4][0] = (i49 / 4) - i50;
            iArr[4][1] = i52;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_5_3)) {
            int sqrt6 = (int) (((double) ((i7 * 9) / 8)) / Math.sqrt(2.0d));
            int i53 = i5 / 2;
            int i54 = i7 / 2;
            iArr[0][0] = i53 - i54;
            int i55 = i6 / 2;
            iArr[0][1] = i55 - i54;
            int i56 = (i53 - sqrt6) - i54;
            iArr[1][0] = i56;
            int i57 = (i55 - sqrt6) - i54;
            iArr[1][1] = i57;
            int i58 = (i53 + sqrt6) - i54;
            iArr[2][0] = i58;
            iArr[2][1] = i57;
            iArr[3][0] = i56;
            int i59 = (i55 + sqrt6) - i54;
            iArr[3][1] = i59;
            iArr[4][0] = i58;
            iArr[4][1] = i59;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_5_4)) {
            int i60 = (i7 * 9) / 8;
            int i61 = i5 / 2;
            int i62 = i7 / 2;
            int i63 = i61 - i62;
            iArr[0][0] = i63;
            int i64 = i6 / 2;
            int i65 = i64 - i62;
            iArr[0][1] = i65;
            iArr[1][0] = (i61 - i60) - i62;
            iArr[1][1] = i65;
            iArr[2][0] = (i61 + i60) - i62;
            iArr[2][1] = i65;
            iArr[3][0] = i63;
            iArr[3][1] = (i64 - i60) - i62;
            iArr[4][0] = i63;
            iArr[4][1] = (i64 + i60) - i62;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_6_1)) {
            int i66 = i7 * 9;
            int i67 = i66 / 8;
            int i68 = i66 / 16;
            int i69 = i5 / 2;
            int i70 = i7 / 2;
            int i71 = (i69 - i67) - i70;
            iArr[0][0] = i71;
            int i72 = i6 / 2;
            int i73 = (i72 - i68) - i70;
            iArr[0][1] = i73;
            int i74 = i69 - i70;
            iArr[1][0] = i74;
            iArr[1][1] = i73;
            int i75 = (i69 + i67) - i70;
            iArr[2][0] = i75;
            iArr[2][1] = i73;
            iArr[3][0] = i71;
            int i76 = (i72 + i68) - i70;
            iArr[3][1] = i76;
            iArr[4][0] = i74;
            iArr[4][1] = i76;
            iArr[5][0] = i75;
            iArr[5][1] = i76;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_6_2)) {
            int i77 = i7 * 9;
            int i78 = i77 / 8;
            int i79 = i77 / 16;
            int i80 = i5 / 2;
            int i81 = i7 / 2;
            int i82 = (i80 - i79) - i81;
            iArr[0][0] = i82;
            int i83 = i6 / 2;
            int i84 = (i83 - i78) - i81;
            iArr[0][1] = i84;
            int i85 = (i80 + i79) - i81;
            iArr[1][0] = i85;
            iArr[1][1] = i84;
            iArr[2][0] = i82;
            int i86 = i83 - i81;
            iArr[2][1] = i86;
            iArr[3][0] = i85;
            iArr[3][1] = i86;
            iArr[4][0] = i82;
            int i87 = (i83 + i78) - i81;
            iArr[4][1] = i87;
            iArr[5][0] = i85;
            iArr[5][1] = i87;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_6_3)) {
            int i88 = (i7 * 9) / 8;
            int i89 = i88 / 2;
            int sqrt7 = (int) (((double) i89) * Math.sqrt(3.0d));
            int i90 = i5 / 2;
            int i91 = i7 / 2;
            iArr[0][0] = (i90 - i88) - i91;
            int i92 = i6 / 2;
            int i93 = i92 - i91;
            iArr[0][1] = i93;
            int i94 = (i90 - i89) - i91;
            iArr[1][0] = i94;
            int i95 = (i92 - sqrt7) - i91;
            iArr[1][1] = i95;
            int i96 = (i89 + i90) - i91;
            iArr[2][0] = i96;
            iArr[2][1] = i95;
            iArr[3][0] = (i90 + i88) - i91;
            iArr[3][1] = i93;
            iArr[4][0] = i96;
            int i97 = (i92 + sqrt7) - i91;
            iArr[4][1] = i97;
            iArr[5][0] = i94;
            iArr[5][1] = i97;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_6_4)) {
            int i98 = (i7 * 9) / 8;
            int i99 = i98 / 2;
            int sqrt8 = (int) (((double) i99) * Math.sqrt(3.0d));
            int i100 = i5 / 2;
            int i101 = i7 / 2;
            int i102 = i100 - i101;
            iArr[0][0] = i102;
            int i103 = i6 / 2;
            iArr[0][1] = (i103 - i98) - i101;
            int i104 = (i100 + sqrt8) - i101;
            iArr[1][0] = i104;
            int i105 = (i103 - i99) - i101;
            iArr[1][1] = i105;
            iArr[2][0] = i104;
            int i106 = (i99 + i103) - i101;
            iArr[2][1] = i106;
            iArr[3][0] = i102;
            iArr[3][1] = (i103 + i98) - i101;
            int i107 = (i100 - sqrt8) - i101;
            iArr[4][0] = i107;
            iArr[4][1] = i106;
            iArr[5][0] = i107;
            iArr[5][1] = i105;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_6_5)) {
            int i108 = (i7 * 9) / 16;
            int sqrt9 = (int) (((double) i108) * Math.sqrt(3.0d));
            int i109 = i5 / 2;
            int i110 = i7 / 2;
            int i111 = i109 - i110;
            iArr[0][0] = i111;
            int i112 = i6 / 2;
            iArr[0][1] = (i112 - sqrt9) - i110;
            iArr[1][0] = (i109 - i108) - i110;
            int i113 = i112 - i110;
            iArr[1][1] = i113;
            iArr[2][0] = (i109 + i108) - i110;
            iArr[2][1] = i113;
            int i114 = i108 * 2;
            iArr[3][0] = (i109 - i114) - i110;
            int i115 = (i112 + sqrt9) - i110;
            iArr[3][1] = i115;
            iArr[4][0] = i111;
            iArr[4][1] = i115;
            iArr[5][0] = (i109 + i114) - i110;
            iArr[5][1] = i115;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_6_6)) {
            int i116 = (i7 * 9) / 16;
            int sqrt10 = (int) (((double) i116) * Math.sqrt(3.0d));
            int i117 = i5 / 2;
            int i118 = i7 / 2;
            int i119 = i117 - i118;
            iArr[0][0] = i119;
            int i120 = i6 / 2;
            iArr[0][1] = (i120 + sqrt10) - i118;
            iArr[1][0] = (i117 - i116) - i118;
            int i121 = i120 - i118;
            iArr[1][1] = i121;
            iArr[2][0] = (i117 + i116) - i118;
            iArr[2][1] = i121;
            int i122 = i116 * 2;
            iArr[3][0] = (i117 - i122) - i118;
            int i123 = (i120 - sqrt10) - i118;
            iArr[3][1] = i123;
            iArr[4][0] = i119;
            iArr[4][1] = i123;
            iArr[5][0] = (i117 + i122) - i118;
            iArr[5][1] = i123;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_7_1)) {
            int i124 = (i7 * 9) / 8;
            int i125 = i5 / 2;
            int i126 = i7 / 2;
            int i127 = i125 - i126;
            iArr[0][0] = i127;
            int i128 = i6 / 2;
            iArr[0][1] = (i128 - i124) - i126;
            int i129 = (i125 - i124) - i126;
            iArr[1][0] = i129;
            int i130 = i128 - i126;
            iArr[1][1] = i130;
            iArr[2][0] = i127;
            iArr[2][1] = i130;
            int i131 = (i125 + i124) - i126;
            iArr[3][0] = i131;
            iArr[3][1] = i130;
            iArr[4][0] = i129;
            int i132 = (i128 + i124) - i126;
            iArr[4][1] = i132;
            iArr[5][0] = i127;
            iArr[5][1] = i132;
            iArr[6][0] = i131;
            iArr[6][1] = i132;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_7_2)) {
            int i133 = (i7 * 9) / 8;
            int i134 = i5 / 2;
            int i135 = i7 / 2;
            int i136 = i134 - i135;
            iArr[0][0] = i136;
            int i137 = i6 / 2;
            iArr[0][1] = (i137 + i133) - i135;
            int i138 = (i134 - i133) - i135;
            iArr[1][0] = i138;
            int i139 = i137 - i135;
            iArr[1][1] = i139;
            iArr[2][0] = i136;
            iArr[2][1] = i139;
            int i140 = (i134 + i133) - i135;
            iArr[3][0] = i140;
            iArr[3][1] = i139;
            iArr[4][0] = i138;
            int i141 = (i137 - i133) - i135;
            iArr[4][1] = i141;
            iArr[5][0] = i136;
            iArr[5][1] = i141;
            iArr[6][0] = i140;
            iArr[6][1] = i141;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_7_3)) {
            int i142 = (i7 * 9) / 8;
            int i143 = i142 / 2;
            int sqrt11 = (int) (((double) i143) * Math.sqrt(3.0d));
            int i144 = i5 / 2;
            int i145 = i7 / 2;
            iArr[0][0] = i144 - i145;
            int i146 = i6 / 2;
            int i147 = i146 - i145;
            iArr[0][1] = i147;
            iArr[1][0] = (i144 - i142) - i145;
            iArr[1][1] = i147;
            int i148 = (i144 - i143) - i145;
            iArr[2][0] = i148;
            int i149 = (i146 - sqrt11) - i145;
            iArr[2][1] = i149;
            int i150 = (i143 + i144) - i145;
            iArr[3][0] = i150;
            iArr[3][1] = i149;
            iArr[4][0] = (i144 + i142) - i145;
            iArr[4][1] = i147;
            iArr[5][0] = i150;
            int i151 = (i146 + sqrt11) - i145;
            iArr[5][1] = i151;
            iArr[6][0] = i148;
            iArr[6][1] = i151;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_7_4)) {
            int i152 = (i7 * 9) / 8;
            int i153 = i152 / 2;
            int sqrt12 = (int) (((double) i153) * Math.sqrt(3.0d));
            int i154 = i5 / 2;
            int i155 = i7 / 2;
            int i156 = i154 - i155;
            iArr[0][0] = i156;
            int i157 = i6 / 2;
            iArr[0][1] = i157 - i155;
            iArr[1][0] = i156;
            iArr[1][1] = (i157 - i152) - i155;
            int i158 = (i154 + sqrt12) - i155;
            iArr[2][0] = i158;
            int i159 = (i157 - i153) - i155;
            iArr[2][1] = i159;
            iArr[3][0] = i158;
            int i160 = (i153 + i157) - i155;
            iArr[3][1] = i160;
            iArr[4][0] = i156;
            iArr[4][1] = (i157 + i152) - i155;
            int i161 = (i154 - sqrt12) - i155;
            iArr[5][0] = i161;
            iArr[5][1] = i160;
            iArr[6][0] = i161;
            iArr[6][1] = i159;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_8_1)) {
            int i162 = (i7 * 9) / 8;
            int i163 = i162 / 2;
            int sqrt13 = (int) (((double) i163) * Math.sqrt(3.0d));
            int i164 = i5 / 2;
            int i165 = i7 / 2;
            int i166 = (i164 - i162) - i165;
            iArr[0][0] = i166;
            int i167 = i6 / 2;
            int i168 = (i167 - sqrt13) - i165;
            iArr[0][1] = i168;
            int i169 = i164 - i165;
            iArr[1][0] = i169;
            iArr[1][1] = i168;
            int i170 = (i162 + i164) - i165;
            iArr[2][0] = i170;
            iArr[2][1] = i168;
            iArr[3][0] = (i164 - i163) - i165;
            int i171 = i167 - i165;
            iArr[3][1] = i171;
            iArr[4][0] = (i164 + i163) - i165;
            iArr[4][1] = i171;
            iArr[5][0] = i166;
            int i172 = (i167 + sqrt13) - i165;
            iArr[5][1] = i172;
            iArr[6][0] = i169;
            iArr[6][1] = i172;
            iArr[7][0] = i170;
            iArr[7][1] = i172;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_8_2)) {
            int i173 = (i7 * 9) / 8;
            int i174 = i173 / 2;
            int sqrt14 = (int) (((double) i174) * Math.sqrt(3.0d));
            int i175 = i5 / 2;
            int i176 = i7 / 2;
            int i177 = (i175 - sqrt14) - i176;
            iArr[0][0] = i177;
            int i178 = i6 / 2;
            int i179 = (i178 - i173) - i176;
            iArr[0][1] = i179;
            iArr[1][0] = i177;
            int i180 = i178 - i176;
            iArr[1][1] = i180;
            iArr[2][0] = i177;
            int i181 = (i173 + i178) - i176;
            iArr[2][1] = i181;
            int i182 = i175 - i176;
            iArr[3][0] = i182;
            iArr[3][1] = (i178 - i174) - i176;
            iArr[4][0] = i182;
            iArr[4][1] = (i178 + i174) - i176;
            int i183 = (i175 + sqrt14) - i176;
            iArr[5][0] = i183;
            iArr[5][1] = i179;
            iArr[6][0] = i183;
            iArr[6][1] = i180;
            iArr[7][0] = i183;
            iArr[7][1] = i181;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_8_3)) {
            int i184 = (i7 * 9) / 8;
            int i185 = i5 / 2;
            int i186 = i7 / 2;
            int i187 = (i185 - i184) - i186;
            iArr[0][0] = i187;
            int i188 = i6 / 2;
            int i189 = (i188 - i184) - i186;
            iArr[0][1] = i189;
            iArr[1][0] = i187;
            int i190 = i188 - i186;
            iArr[1][1] = i190;
            iArr[2][0] = i187;
            int i191 = (i188 + i184) - i186;
            iArr[2][1] = i191;
            int i192 = i185 - i186;
            iArr[3][0] = i192;
            iArr[3][1] = i189;
            iArr[4][0] = i192;
            iArr[4][1] = i191;
            int i193 = (i185 + i184) - i186;
            iArr[5][0] = i193;
            iArr[5][1] = i189;
            iArr[6][0] = i193;
            iArr[6][1] = i190;
            iArr[7][0] = i193;
            iArr[7][1] = i191;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_9_1)) {
            int i194 = (i7 * 9) / 8;
            int i195 = i5 / 2;
            int i196 = i7 / 2;
            int i197 = (i195 - i194) - i196;
            iArr[0][0] = i197;
            int i198 = i6 / 2;
            int i199 = (i198 - i194) - i196;
            iArr[0][1] = i199;
            iArr[1][0] = i197;
            int i200 = i198 - i196;
            iArr[1][1] = i200;
            iArr[2][0] = i197;
            int i201 = (i198 + i194) - i196;
            iArr[2][1] = i201;
            int i202 = i195 - i196;
            iArr[3][0] = i202;
            iArr[3][1] = i199;
            iArr[4][0] = i202;
            iArr[4][1] = i200;
            iArr[5][0] = i202;
            iArr[5][1] = i201;
            int i203 = (i195 + i194) - i196;
            iArr[6][0] = i203;
            iArr[6][1] = i199;
            iArr[7][0] = i203;
            iArr[7][1] = i200;
            iArr[8][0] = i203;
            iArr[8][1] = i201;
            return iArr;
        } else if (placeType2.equals(PlaceType.CIRCLE_9_2)) {
            int sqrt15 = (int) (((double) ((i7 * 8) / 8)) * Math.sqrt(2.0d));
            int i204 = i5 / 2;
            int i205 = i7 / 2;
            int i206 = i204 - i205;
            iArr[0][0] = i206;
            int i207 = i6 / 2;
            iArr[0][1] = (i207 - sqrt15) - i205;
            int i208 = sqrt15 / 2;
            int i209 = (i204 - i208) - i205;
            iArr[1][0] = i209;
            int i210 = (i207 - i208) - i205;
            iArr[1][1] = i210;
            int i211 = (i204 + i208) - i205;
            iArr[2][0] = i211;
            iArr[2][1] = i210;
            iArr[3][0] = (i204 - sqrt15) - i205;
            int i212 = i207 - i205;
            iArr[3][1] = i212;
            iArr[4][0] = i206;
            iArr[4][1] = i212;
            iArr[5][0] = (i204 + sqrt15) - i205;
            iArr[5][1] = i212;
            iArr[6][0] = i209;
            int i213 = (i208 + i207) - i205;
            iArr[6][1] = i213;
            iArr[7][0] = i211;
            iArr[7][1] = i213;
            iArr[8][0] = i206;
            iArr[8][1] = (i207 + sqrt15) - i205;
            return iArr;
        } else if (placeType2.equals(PlaceType.HAM_1_1)) {
            iArr[0][0] = (i5 / 2) - (i7 / 2);
            iArr[0][1] = (i6 / 2) - (i4 / 2);
            return iArr;
        } else if (placeType2.equals(PlaceType.HAM_2_1)) {
            int i214 = (i5 / 2) - (i7 / 2);
            iArr[0][0] = i214;
            int i215 = i6 / 2;
            iArr[0][1] = i215 - i4;
            iArr[1][0] = i214;
            iArr[1][1] = i215 + i4;
            return iArr;
        } else if (placeType2.equals(PlaceType.HAM_3_1)) {
            int i216 = (i5 / 2) - (i7 / 2);
            iArr[0][0] = i216;
            int i217 = i6 / 2;
            iArr[0][1] = i217 - ((i4 * 7) / 4);
            iArr[1][0] = i216;
            iArr[1][1] = i217 - (i4 / 2);
            iArr[2][0] = i216;
            iArr[2][1] = i217 + ((i4 * 3) / 4);
            return iArr;
        } else if (!placeType2.equals(PlaceType.HAM_4_1)) {
            return (PlaceType.SHARE_3_1.v > placeType2.v || placeType2.v > PlaceType.SHARE_9_2.v) ? iArr : a(PlaceType.valueOf(placeType2.v - (PlaceType.SHARE_3_1.v - PlaceType.CIRCLE_3_1.v)), i5, i6, i7, i7);
        } else {
            int i218 = (i5 / 2) - (i7 / 2);
            iArr[0][0] = i218;
            int i219 = i6 / 2;
            iArr[0][1] = i219 - ((i4 * 23) / 10);
            iArr[1][0] = i218;
            iArr[1][1] = i219 - ((i4 * 11) / 10);
            iArr[2][0] = i218;
            iArr[2][1] = (i4 / 10) + i219;
            iArr[3][0] = i218;
            iArr[3][1] = i219 + ((i4 * 13) / 10);
            return iArr;
        }
    }
}