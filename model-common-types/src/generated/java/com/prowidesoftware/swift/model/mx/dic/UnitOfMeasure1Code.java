
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitOfMeasure1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnitOfMeasure1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PIEC"/>
 *     <enumeration value="TONS"/>
 *     <enumeration value="FOOT"/>
 *     <enumeration value="GBGA"/>
 *     <enumeration value="USGA"/>
 *     <enumeration value="GRAM"/>
 *     <enumeration value="INCH"/>
 *     <enumeration value="KILO"/>
 *     <enumeration value="PUND"/>
 *     <enumeration value="METR"/>
 *     <enumeration value="CMET"/>
 *     <enumeration value="MMET"/>
 *     <enumeration value="LITR"/>
 *     <enumeration value="CELI"/>
 *     <enumeration value="MILI"/>
 *     <enumeration value="GBOU"/>
 *     <enumeration value="USOU"/>
 *     <enumeration value="GBQA"/>
 *     <enumeration value="USQA"/>
 *     <enumeration value="GBPI"/>
 *     <enumeration value="USPI"/>
 *     <enumeration value="MILE"/>
 *     <enumeration value="KMET"/>
 *     <enumeration value="YARD"/>
 *     <enumeration value="SQKI"/>
 *     <enumeration value="HECT"/>
 *     <enumeration value="ARES"/>
 *     <enumeration value="SMET"/>
 *     <enumeration value="SCMT"/>
 *     <enumeration value="SMIL"/>
 *     <enumeration value="SQMI"/>
 *     <enumeration value="SQYA"/>
 *     <enumeration value="SQFO"/>
 *     <enumeration value="SQIN"/>
 *     <enumeration value="ACRE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnitOfMeasure1Code")
@XmlEnum
public enum UnitOfMeasure1Code {


    /**
     * Standard length of cloth, wallpaper, as an item for sale or amount of a substance.
     * 
     */
    PIEC,

    /**
     * Measure of weight, in Britain 2240lb (long ton)and in the US 2000lb (short ton).
     * 
     */
    TONS,

    /**
     * Unit of length equal to 1/3 yard.
     * 
     */
    FOOT,

    /**
     * Unit of volume that is equal to 8 pints.
     * 
     */
    GBGA,

    /**
     * Unit of volume that is equal to 8 pints.
     * 
     */
    USGA,

    /**
     * Unit of measure that is equal to a 1, 000th of a kilo.
     * 
     */
    GRAM,

    /**
     * Measure of length equal to 2.54 cm.
     * 
     */
    INCH,

    /**
     * Basic unit of mass in the SI system, 1000 grams.
     * 
     */
    KILO,

    /**
     * Unit of weight equal to 0.454 kilograms.
     * 
     */
    PUND,

    /**
     * Unit of length in the metric system, equal to 39.37 inches.
     * 
     */
    METR,

    /**
     * Unit of measure that is equal to one hundredth of a metre.
     * 
     */
    CMET,

    /**
     * Unit of measure that is a thousandth of one metre.
     * 
     */
    MMET,

    /**
     * Unit of volume that is equal to a thousand cubic centimetres.
     * 
     */
    LITR,

    /**
     * Unit of volume that is equal to one hundredth of a litre.
     * 
     */
    CELI,

    /**
     * Unit of volume that is equal to one thousandth of a litre.
     * 
     */
    MILI,

    /**
     * Unit of weight equal to a sixteenth of a pound.
     * 
     */
    GBOU,

    /**
     * Unit of weight equal to a sixteenth of a pound.
     * 
     */
    USOU,

    /**
     * Unit of volume that is equal to 2 pints.
     * 
     */
    GBQA,

    /**
     * Unit of volume that is equal to 2 pints.
     * 
     */
    USQA,

    /**
     * Unit of volume that is equal to 568 cubic centimetres.
     * 
     */
    GBPI,

    /**
     * Unit of volume that is equal to 473 cubic centimetres.
     * 
     */
    USPI,

    /**
     * Unit of length equal to 1, 760 yards.
     * 
     */
    MILE,

    /**
     * Unit of measure that is equal to 1, 000 meters.
     * 
     */
    KMET,

    /**
     * Unit of length equal to 3 feet or 0.9144 metre.
     * 
     */
    YARD,

    /**
     * Measure of a surface, one kilometre by one kilometre.
     * 
     */
    SQKI,

    /**
     * Unit of measure that is equal to 10, 000 square meters.
     * 
     */
    HECT,

    /**
     * Unit of measure equal to a 100 square meters.
     * 
     */
    ARES,

    /**
     * Measure of a surface, one metre by one metre.
     * 
     */
    SMET,

    /**
     * Measure of a surface, one centimetre by one centimetre.
     * 
     */
    SCMT,

    /**
     * Measure of a surface, one millimetre by one millimetre.
     * 
     */
    SMIL,

    /**
     * Measure of a surface, one mile by one mile.
     * 
     */
    SQMI,

    /**
     * Measure of a surface, one yard by one yard.
     * 
     */
    SQYA,

    /**
     * Measure of a surface, one foot by one foot.
     * 
     */
    SQFO,

    /**
     * Measure of a surface, one inch by one inch.
     * 
     */
    SQIN,

    /**
     * Unit of measure equal to 4, 840 square yards.
     * 
     */
    ACRE;

    public String value() {
        return name();
    }

    public static UnitOfMeasure1Code fromValue(String v) {
        return valueOf(v);
    }

}
