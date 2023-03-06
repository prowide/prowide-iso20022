
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitOfMeasure6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitOfMeasure6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PIEC"/&gt;
 *     &lt;enumeration value="TONS"/&gt;
 *     &lt;enumeration value="FOOT"/&gt;
 *     &lt;enumeration value="GBGA"/&gt;
 *     &lt;enumeration value="USGA"/&gt;
 *     &lt;enumeration value="GRAM"/&gt;
 *     &lt;enumeration value="INCH"/&gt;
 *     &lt;enumeration value="KILO"/&gt;
 *     &lt;enumeration value="PUND"/&gt;
 *     &lt;enumeration value="METR"/&gt;
 *     &lt;enumeration value="CMET"/&gt;
 *     &lt;enumeration value="MMET"/&gt;
 *     &lt;enumeration value="LITR"/&gt;
 *     &lt;enumeration value="CELI"/&gt;
 *     &lt;enumeration value="MILI"/&gt;
 *     &lt;enumeration value="GBOU"/&gt;
 *     &lt;enumeration value="USOU"/&gt;
 *     &lt;enumeration value="GBQA"/&gt;
 *     &lt;enumeration value="USQA"/&gt;
 *     &lt;enumeration value="GBPI"/&gt;
 *     &lt;enumeration value="USPI"/&gt;
 *     &lt;enumeration value="MILE"/&gt;
 *     &lt;enumeration value="KMET"/&gt;
 *     &lt;enumeration value="YARD"/&gt;
 *     &lt;enumeration value="SQKI"/&gt;
 *     &lt;enumeration value="HECT"/&gt;
 *     &lt;enumeration value="ARES"/&gt;
 *     &lt;enumeration value="SMET"/&gt;
 *     &lt;enumeration value="SCMT"/&gt;
 *     &lt;enumeration value="SMIL"/&gt;
 *     &lt;enumeration value="SQMI"/&gt;
 *     &lt;enumeration value="SQYA"/&gt;
 *     &lt;enumeration value="SQFO"/&gt;
 *     &lt;enumeration value="SQIN"/&gt;
 *     &lt;enumeration value="ACRE"/&gt;
 *     &lt;enumeration value="KWHO"/&gt;
 *     &lt;enumeration value="DGEU"/&gt;
 *     &lt;enumeration value="GGEU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnitOfMeasure6Code")
@XmlEnum
public enum UnitOfMeasure6Code {


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
    ACRE,

    /**
     * Unit of measure that is equal to the power consumption of one kilowatt during one hour.
     * 
     */
    KWHO,

    /**
     * Amount of fuel alternative equal to one gallon of diesel.
     * 
     */
    DGEU,

    /**
     * Amount of fuel alternative equal to one gallon of gasoline.
     * 
     */
    GGEU;

    public String value() {
        return name();
    }

    public static UnitOfMeasure6Code fromValue(String v) {
        return valueOf(v);
    }

}
