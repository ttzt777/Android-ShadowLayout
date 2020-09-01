package cc.bear3.view.shadowlayout.layout;

import androidx.annotation.ColorInt;
import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import cc.bear3.view.shadowlayout.helper.ShadowLayoutHelper;

/**
 * 阴影接口
 */
public interface IShadowLayout {
    int HIDE_RADIUS_SIDE_NONE = 0;
    int HIDE_RADIUS_SIDE_TOP = 1;
    int HIDE_RADIUS_SIDE_RIGHT = 2;
    int HIDE_RADIUS_SIDE_BOTTOM = 3;
    int HIDE_RADIUS_SIDE_LEFT = 4;

    @IntDef(value = {
            HIDE_RADIUS_SIDE_NONE,
            HIDE_RADIUS_SIDE_TOP,
            HIDE_RADIUS_SIDE_RIGHT,
            HIDE_RADIUS_SIDE_BOTTOM,
            HIDE_RADIUS_SIDE_LEFT})
    @Retention(RetentionPolicy.SOURCE)
    @interface HideRadiusSide {
    }

    boolean setWidthLimit(int widthLimit);

    boolean setHeightLimit(int heightLimit);

    void setUseThemeGeneralShadowElevation();

    void setOutlineExcludePadding(boolean outlineExcludePadding);

    void setShadowElevation(int elevation);

    int getShadowElevation();

    /**
     * 设置阴影透明度
     * @param shadowAlpha 0 - 1
     */
    void setShadowAlpha(float shadowAlpha);

    float getShadowAlpha();

    /**
     * 设置阴影颜色
     * @param shadowColor 颜色
     */
    void setShadowColor(int shadowColor);

    int getShadowColor();

    /**
     * 设置圆角
     * @param radius 圆角
     */
    void setRadius(int radius);

    void setRadius(int radius, @ShadowLayoutHelper.HideRadiusSide int hideRadiusSide);

    int getRadius();

    void setOutlineInset(int left, int top, int right, int bottom);

    void setShowBorderOnlyBeforeL(boolean showBorderOnlyBeforeL);

    void setHideRadiusSide(@HideRadiusSide int hideRadiusSide);

    int getHideRadiusSide();

    void setRadiusAndShadow(int radius, int shadowElevation, float shadowAlpha);

    void setRadiusAndShadow(int radius, @HideRadiusSide int hideRadiusSide, int shadowElevation, float shadowAlpha);

    void setRadiusAndShadow(int radius, @HideRadiusSide int hideRadiusSide, int shadowElevation, int shadowColor, float shadowAlpha);

    void setBorderColor(@ColorInt int borderColor);

    void setBorderWidth(int borderWidth);

    void updateTopDivider(int topInsetLeft, int topInsetRight, int topDividerHeight, int topDividerColor);

    void updateBottomDivider(int bottomInsetLeft, int bottomInsetRight, int bottomDividerHeight, int bottomDividerColor);

    void updateLeftDivider(int leftInsetTop, int leftInsetBottom, int leftDividerWidth, int leftDividerColor);

    void updateRightDivider(int rightInsetTop, int rightInsetBottom, int rightDividerWidth, int rightDividerColor);

    void onlyShowTopDivider(int topInsetLeft, int topInsetRight, int topDividerHeight, int topDividerColor);

    void onlyShowBottomDivider(int bottomInsetLeft, int bottomInsetRight, int bottomDividerHeight, int bottomDividerColor);

    void onlyShowLeftDivider(int leftInsetTop, int leftInsetBottom, int leftDividerWidth, int leftDividerColor);

    void onlyShowRightDivider(int rightInsetTop, int rightInsetBottom, int rightDividerWidth, int rightDividerColor);

    void setTopDividerAlpha(int dividerAlpha);

    void setBottomDividerAlpha(int dividerAlpha);

    void setLeftDividerAlpha(int dividerAlpha);

    void setRightDividerAlpha(int dividerAlpha);

    void setOuterNormalColor(int color);

    void updateLeftSeparatorColor(int color);

    void updateRightSeparatorColor(int color);

    void updateTopSeparatorColor(int color);

    void updateBottomSeparatorColor(int color);

    boolean hasTopSeparator();

    boolean hasRightSeparator();

    boolean hasLeftSeparator();

    boolean hasBottomSeparator();

    boolean hasBorder();

}
