
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitOfMeasure9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnitOfMeasure9Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BAGG"/>
 *     <enumeration value="BALE"/>
 *     <enumeration value="BOTL"/>
 *     <enumeration value="BOXX"/>
 *     <enumeration value="CRTN"/>
 *     <enumeration value="CELI"/>
 *     <enumeration value="CMET"/>
 *     <enumeration value="CNTR"/>
 *     <enumeration value="CRAT"/>
 *     <enumeration value="CBIN"/>
 *     <enumeration value="CBME"/>
 *     <enumeration value="CBML"/>
 *     <enumeration value="PIEC"/>
 *     <enumeration value="FOOT"/>
 *     <enumeration value="GBFO"/>
 *     <enumeration value="GBGA"/>
 *     <enumeration value="GBPI"/>
 *     <enumeration value="GBQA"/>
 *     <enumeration value="GBTN"/>
 *     <enumeration value="GRAM"/>
 *     <enumeration value="INCH"/>
 *     <enumeration value="KILO"/>
 *     <enumeration value="KMET"/>
 *     <enumeration value="LITR"/>
 *     <enumeration value="METR"/>
 *     <enumeration value="TONE"/>
 *     <enumeration value="MILE"/>
 *     <enumeration value="MMET"/>
 *     <enumeration value="MILI"/>
 *     <enumeration value="PUND"/>
 *     <enumeration value="USOU"/>
 *     <enumeration value="SCMT"/>
 *     <enumeration value="SQFO"/>
 *     <enumeration value="SQIN"/>
 *     <enumeration value="SQKI"/>
 *     <enumeration value="SMET"/>
 *     <enumeration value="SQMI"/>
 *     <enumeration value="SMIL"/>
 *     <enumeration value="SQYA"/>
 *     <enumeration value="USBA"/>
 *     <enumeration value="USFO"/>
 *     <enumeration value="USGA"/>
 *     <enumeration value="USPI"/>
 *     <enumeration value="USQA"/>
 *     <enumeration value="USTN"/>
 *     <enumeration value="YARD"/>
 *     <enumeration value="GBOU"/>
 *     <enumeration value="ACRE"/>
 *     <enumeration value="ARES"/>
 *     <enumeration value="HECT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnitOfMeasure9Code")
@XmlEnum
public enum UnitOfMeasure9Code {


    /**
     * Code for a bag.
     * 
     */
    BAGG,

    /**
     * Code for a bale.
     * 
     */
    BALE,

    /**
     * Code for a bottle.
     * 
     */
    BOTL,

    /**
     * Code for a box.
     * 
     */
    BOXX,

    /**
     * Code for a carton.
     * 
     */
    CRTN,

    /**
     * Unit of volume that is equal to one hundredth of a litre.
     * 
     */
    CELI,

    /**
     * Unit of measure that is equal to one hundredth of a metre.
     * 
     */
    CMET,

    /**
     * Code for a container.
     * 
     */
    CNTR,

    /**
     * Code for a crate.
     * 
     */
    CRAT,

    /**
     * Measure of a volume, one inch by one inch by one inch.
     * 
     */
    CBIN,

    /**
     * Unit of volume that is equal to one meter in length, breadth and height or also equal to 1000 liters.
     * 
     */
    CBME,

    /**
     * Unit of volume that is equal to one thousandth of a litre.
     * 
     */
    CBML,

    /**
     * Standard length of cloth, wallpaper, as an item for sale or amount of a substance.
     * 
     */
    PIEC,

    /**
     * Unit of length equal to 1/3 yard.
     * 
     */
    FOOT,

    /**
     * Unit of volume equal to 2, 841 306 centilitre.
     * 
     */
    GBFO,

    /**
     * Unit of volume that is equal to 8 pints.
     * 
     */
    GBGA,

    /**
     * Unit of volume that is equal to 568 cubic centimetres.
     * 
     */
    GBPI,

    /**
     * Unit of volume that is equal to 2 pints.
     * 
     */
    GBQA,

    /**
     * Measure of weight, in Britain 2240 lb (long ton).
     * 
     */
    GBTN,

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
     * Unit of measure that is equal to 1, 000 meters.
     * 
     */
    KMET,

    /**
     * Unit of volume that is equal to a thousand cubic centimetres.
     * 
     */
    LITR,

    /**
     * Unit of length in the metric system, equal to 39.37 inches.
     * 
     */
    METR,

    /**
     * Unit of mass equal to 1000 kilograms; equivalent to approximately 2,204.6 pounds, 1.102 short tons (US) or 0.984 long tons (imperial).
     * 
     */
    TONE,

    /**
     * Unit of length equal to 1, 760 yards.
     * 
     */
    MILE,

    /**
     * Unit of measure that is a thousandth of one metre.
     * 
     */
    MMET,

    /**
     * Unit of volume that is equal to one thousandth of a litre.
     * 
     */
    MILI,

    /**
     * Unit of weight equal to 0.454 kilograms.
     * 
     */
    PUND,

    /**
     * Unit of weight equal to a sixteenth of a pound.
     * 
     */
    USOU,

    /**
     * Measure of a surface, one centimetre by one centimetre.
     * 
     */
    SCMT,

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
     * Measure of a surface, one kilometre by one kilometre.
     * 
     */
    SQKI,

    /**
     * Measure of a surface, one metre by one metre.
     * 
     */
    SMET,

    /**
     * Measure of a surface, one mile by one mile.
     * 
     */
    SQMI,

    /**
     * Measure of a surface, one millimetre by one millimetre.
     * 
     */
    SMIL,

    /**
     * Measure of a surface, one yard by one yard.
     * 
     */
    SQYA,

    /**
     * Unit of volume equal to 158, 9873 litre.
     * 
     */
    USBA,

    /**
     * Unit of volume equal to 2, 957353 centilitre.
     * 
     */
    USFO,

    /**
     * Unit of volume that is equal to 8 pints.
     * 
     */
    USGA,

    /**
     * Unit of volume that is equal to 473 cubic centimetres.
     * 
     */
    USPI,

    /**
     * Unit of volume that is equal to 2 pints.
     * 
     */
    USQA,

    /**
     * Measure of weight, in the US 2000 lb (short ton).
     * 
     */
    USTN,

    /**
     * Unit of length equal to 3 feet or 0.9144 metre.
     * 
     */
    YARD,

    /**
     * Unit of weight equal to a sixteenth of a pound.
     * 
     */
    GBOU,

    /**
     * Unit of measure equal to 4, 840 square yards.
     * 
     */
    ACRE,

    /**
     * Unit of measure equal to a 100 square meters.
     * 
     */
    ARES,

    /**
     * Unit of measure that is equal to 10, 000 square meters.
     * 
     */
    HECT;

    public String value() {
        return name();
    }

    public static UnitOfMeasure9Code fromValue(String v) {
        return valueOf(v);
    }

}
