package main

import patterns.behavioral.chain_of_responsibility.OrcKing
import patterns.behavioral.chain_of_responsibility.Request
import patterns.behavioral.chain_of_responsibility.RequestType
import patterns.behavioral.strategy.Strategy
import patterns.creational.abstract_factory.Battle
import patterns.creational.builder.Hero
import patterns.creational.fabric_method.War
import patterns.creational.fabric_method.elf.ElfBlacksmith
import patterns.creational.fabric_method.orc.OrcBlacksmith
import patterns.creational.prototype.Barracks
import patterns.creational.prototype_shape.Geometry
import patterns.creational.simple_factory.*
import patterns.creational.singleton.Tower
import patterns.structural.adapter.Captain
import patterns.structural.adapter.FishingBoatAdapter
import patterns.structural.adapter_2.AdapterExample
import patterns.structural.bridge.FlyingEnchantment
import patterns.structural.bridge.Hammer
import patterns.structural.bridge.SoulEatingEnchantment
import patterns.structural.bridge.Staff
import kotlin.jvm.JvmStatic
import patterns.structural.composite.Messenger
import patterns.structural.composite_2.Messenger2
import patterns.structural.decorator.ClubbedTroll
import patterns.structural.decorator.StupidTroll
import patterns.structural.facade.DwarvenGoldmineFacade
import patterns.structural.flyweight.AlchemistShop
import patterns.structural.proxy.IvoryTower
import patterns.structural.proxy.Wizard
import patterns.structural.proxy.WizardTowerProxy
import java.util.function.Supplier

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        decorator()
    }


    private fun decorator() {
        println("Troll is walking around")
        val troll = StupidTroll()
        troll.attack()
        troll.fleeBattle()
        println("Stupid troll power: ${troll.getAttackPower()}")
        println("But troll is very lucky and find wooden club!")
        val clubbedTroll = ClubbedTroll(troll)
        clubbedTroll.attack()
        clubbedTroll.fleeBattle()
        println("Clubbed troll power: ${clubbedTroll.getAttackPower()}")
    }
















    private fun composite() {
        val androidMessage = Messenger().messageFromAndroid()
        androidMessage.play()
        val iosMessage = Messenger().messageFromIos()
        iosMessage.play()
    }

    private fun simpleFactory() {
        val factory =
            WeaponFactory.factory { builder: Builder ->
                builder.add(WeaponType.SWORD, Supplier { Sword() })
                builder.add(WeaponType.AXE, Supplier { Axe() })
                builder.add(WeaponType.SPEAR, Supplier { Spear() })
                builder.add(WeaponType.BOW, Supplier { Bow() })
            }

        val axe = factory.create(WeaponType.AXE)
    }

    private fun fabricMethod() {
        val war = War(ElfBlacksmith())
        val war1 = War(OrcBlacksmith())
    }

    private fun abstractFactory() {
        val battle = Battle()
    }

    private fun builder() {
        var mage = Hero.Builder("mage", "Gandalf")
            .withArmor("epic")
            .withHairColor("white")
            .withWeapon("dagger")
    }

    private fun prototype() {
        var barracks = Barracks()
    }

    private fun prototypeShape() {
        var geometry = Geometry()
    }

    private fun singleton() {
        var tower = Tower()
    }

    private fun adapter() {
        // The captain can only operate rowing boats but with adapter he is able to
        // use fishing boats as well
        val captain = Captain(FishingBoatAdapter())
        captain.row()
    }

    private fun bridge() {
        println("The huge orc found cursed hummer")
        val hummer = Hammer(FlyingEnchantment())
        hummer.wield()
        hummer.swing()
        hummer.unwield()

        println("Gandalf took enemy's staff")
        val staff = Staff(SoulEatingEnchantment())
        staff.wield()
        staff.swing()
        staff.unwield()
    }



    private fun facade() {
        val facade = DwarvenGoldmineFacade()
        facade.startNewDay()
        facade.digOutGold()
        facade.endDay()
    }

    private fun flyweight() {
        val alchemistShop = AlchemistShop()
        alchemistShop.enumerate()
    }

    private fun proxy() {
        val towerProxy = WizardTowerProxy(IvoryTower())
        towerProxy.enter(Wizard("Gray Wizard"))
        towerProxy.enter(Wizard("Dark Wizard"))
        towerProxy.enter(Wizard("White Wizard"))
        towerProxy.enter(Wizard("Evil Wizard"))
        towerProxy.enter(Wizard("Evil Wizard"))
        towerProxy.enter(Wizard("Evil Wizard"))
    }

    private fun chainOfResponsibility() {
        val king = OrcKing()
        king.makeRequest(Request(RequestType.DEFEND_CASTLE, "defend castle"))
        king.makeRequest(Request(RequestType.TORTURE_PRISONER, "torture prisoner"))
        king.makeRequest(Request(RequestType.COLLECT_TAX, "collect tax"))
    }

    private fun adapterExample(){
        AdapterExample()
    }

    private fun strategy(){
        Strategy()
    }
}