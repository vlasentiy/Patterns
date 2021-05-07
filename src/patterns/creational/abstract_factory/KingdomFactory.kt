package patterns.creational.abstract_factory

import patterns.creational.abstract_factory.Army
import patterns.creational.abstract_factory.Castle
import patterns.creational.abstract_factory.King


interface KingdomFactory {
    fun createCastle(): Castle
    fun createKing(): King
    fun createArmy(): Army
}