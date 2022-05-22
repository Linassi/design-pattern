package com.study.design_pattern.decorate;

public class DecorateWithRing implements IBeauty{

    private final IBeauty girl;

    public DecorateWithRing(IBeauty girl) {
        this.girl = girl;
    }

    @Override
    public int getBeautyValue() {
        return girl.getBeautyValue() + 1;
    }
}
