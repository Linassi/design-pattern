package com.study.design_pattern.decorate;

public class DecorateMode {
    public static void main(String[] args) {
        //装饰模式
        IBeauty newGirl = new Girl();
        System.out.println("创建了1个" + newGirl.getBeautyValue() + "分的Girl");

        IBeauty girlDecorateWithRing = new DecorateWithRing(newGirl);
        System.out.println("用" + DecorateWithRing.class + "把Girl装饰到" + girlDecorateWithRing.getBeautyValue() + "分");

        IBeauty girlDecorateWithRingAndNecklace = new DecorateWithNeckLace(girlDecorateWithRing);
        System.out.println("用" + DecorateWithNeckLace.class + "把Girl装饰到" + girlDecorateWithRingAndNecklace.getBeautyValue() + "分");

    }
}
