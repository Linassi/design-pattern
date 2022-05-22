package com.study.design_pattern.decorate;

public class DecorateWithNeckLace implements IBeauty{

    private final IBeauty girl;

    public DecorateWithNeckLace(IBeauty girl) {
        this.girl = girl;
    }

    @Override
    public int getBeautyValue() {
        return girl.getBeautyValue() + 2;
    }

}
