
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitOfMeasure12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnitOfMeasure12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACRE"/>
 *     <enumeration value="ALOW"/>
 *     <enumeration value="ACCY"/>
 *     <enumeration value="ARES"/>
 *     <enumeration value="BAGG"/>
 *     <enumeration value="BALE"/>
 *     <enumeration value="BARL"/>
 *     <enumeration value="BCUF"/>
 *     <enumeration value="BDFT"/>
 *     <enumeration value="BOTL"/>
 *     <enumeration value="BOXX"/>
 *     <enumeration value="BRTU"/>
 *     <enumeration value="BUSL"/>
 *     <enumeration value="CRTN"/>
 *     <enumeration value="CELI"/>
 *     <enumeration value="CMET"/>
 *     <enumeration value="YARD"/>
 *     <enumeration value="USTN"/>
 *     <enumeration value="USQA"/>
 *     <enumeration value="USPI"/>
 *     <enumeration value="USOU"/>
 *     <enumeration value="UCWT"/>
 *     <enumeration value="USGA"/>
 *     <enumeration value="USFO"/>
 *     <enumeration value="USBA"/>
 *     <enumeration value="OZTR"/>
 *     <enumeration value="TOCD"/>
 *     <enumeration value="MILI"/>
 *     <enumeration value="MMET"/>
 *     <enumeration value="MIBA"/>
 *     <enumeration value="MBTU"/>
 *     <enumeration value="PIEC"/>
 *     <enumeration value="PUND"/>
 *     <enumeration value="PWRD"/>
 *     <enumeration value="SHAS"/>
 *     <enumeration value="SCMT"/>
 *     <enumeration value="SQFO"/>
 *     <enumeration value="SQIN"/>
 *     <enumeration value="SQKI"/>
 *     <enumeration value="SMET"/>
 *     <enumeration value="SQMI"/>
 *     <enumeration value="SMIL"/>
 *     <enumeration value="SQYA"/>
 *     <enumeration value="THMS"/>
 *     <enumeration value="TONS"/>
 *     <enumeration value="MILE"/>
 *     <enumeration value="TONE"/>
 *     <enumeration value="METR"/>
 *     <enumeration value="MWYC"/>
 *     <enumeration value="MMOC"/>
 *     <enumeration value="MWMC"/>
 *     <enumeration value="MWHC"/>
 *     <enumeration value="MWHO"/>
 *     <enumeration value="MWDC"/>
 *     <enumeration value="LOTS"/>
 *     <enumeration value="LITR"/>
 *     <enumeration value="KWYC"/>
 *     <enumeration value="KWMC"/>
 *     <enumeration value="KMOC"/>
 *     <enumeration value="KWHC"/>
 *     <enumeration value="KWDC"/>
 *     <enumeration value="KWHO"/>
 *     <enumeration value="KMET"/>
 *     <enumeration value="KILO"/>
 *     <enumeration value="IPNT"/>
 *     <enumeration value="INCH"/>
 *     <enumeration value="HUWG"/>
 *     <enumeration value="HECT"/>
 *     <enumeration value="GRAM"/>
 *     <enumeration value="GWHO"/>
 *     <enumeration value="GBTN"/>
 *     <enumeration value="GBQA"/>
 *     <enumeration value="GBPI"/>
 *     <enumeration value="GBOU"/>
 *     <enumeration value="GBGA"/>
 *     <enumeration value="GBFO"/>
 *     <enumeration value="GGEU"/>
 *     <enumeration value="FUTU"/>
 *     <enumeration value="FOOT"/>
 *     <enumeration value="ENVO"/>
 *     <enumeration value="ENVC"/>
 *     <enumeration value="DMET"/>
 *     <enumeration value="DGEU"/>
 *     <enumeration value="DAYS"/>
 *     <enumeration value="CBML"/>
 *     <enumeration value="CBME"/>
 *     <enumeration value="CBIN"/>
 *     <enumeration value="CRAT"/>
 *     <enumeration value="CNTR"/>
 *     <enumeration value="CLRT"/>
 *     <enumeration value="CEER"/>
 *     <enumeration value="CDDA"/>
 *     <enumeration value="CPDA"/>
 *     <enumeration value="HDDA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnitOfMeasure12Code")
@XmlEnum
public enum UnitOfMeasure12Code {


    /**
     * Unit of measure equal to 4, 840 square yards.
     * 
     */
    ACRE,

    /**
     * Amount of money deducted from a price or an amount due.
     * 
     */
    ALOW,

    /**
     * Number of monetary units specified in a currency, where the unit of currency is explicit and compliant with ISO 4217.
     * 
     */
    ACCY,

    /**
     * Unit of measure equal to a 100 square meters.
     * 
     */
    ARES,

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
     * Unit of volume that is equal to 42 US gallons.
     * 
     */
    BARL,

    /**
     * Unit of measure for large volumes of natural gas equivalent to 28316846 cubic meters.
     * 
     */
    BCUF,

    /**
     * Measure of length equal to 144 cubic inches.
     * 
     */
    BDFT,

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
     * Unit of measure of heat required to raise the temperature of one pound of water by one degree Fahrenheit.
     * 
     */
    BRTU,

    /**
     * Unit of weight that is equal to 8 gallons. Mostly used for agricultural products with a specification of weight defined for each commodity differently.
     * 
     */
    BUSL,

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
     * Unit of length equal to 3 feet or 0.9144 metre.
     * 
     */
    YARD,

    /**
     * Measure of weight, in the US 2000 lb (short ton).
     * 
     */
    USTN,

    /**
     * Unit of volume that is equal to 2 pints.
     * 
     */
    USQA,

    /**
     * Unit of volume that is equal to 473 cubic centimetres.
     * 
     */
    USPI,

    /**
     * Unit of weight equal to a sixteenth of a pound.
     * 
     */
    USOU,

    /**
     * Unit of weight or mass of various values in the US Customary System also known as quintal, cental or centum. Equal to 100 lbs.
     * 
     */
    UCWT,

    /**
     * Unit of volume that is equal to 8 pints.
     * 
     */
    USGA,

    /**
     * Unit of volume equal to 2, 957353 centilitre.
     * 
     */
    USFO,

    /**
     * Unit of volume equal to 158, 9873 litre.
     * 
     */
    USBA,

    /**
     * Unit of weight equal to 31.1034768 grams. Used in precious metals.
     * 
     */
    OZTR,

    /**
     * Tons of carbon dioxide.
     * 
     */
    TOCD,

    /**
     * Unit of volume that is equal to one thousandth of a litre.
     * 
     */
    MILI,

    /**
     * Unit of measure that is a thousandth of one metre.
     * 
     */
    MMET,

    /**
     * Unit of volume that is equal to 1 million barrels equivalent to 42.000.000 US gallons.
     * 
     */
    MIBA,

    /**
     * Unit of measure of heat equal to one million British thermal unit (BTU).
     * 
     */
    MBTU,

    /**
     * Standard length of cloth, wallpaper, as an item for sale or amount of a substance.
     * 
     */
    PIEC,

    /**
     * Unit of weight equal to 0.454 kilograms.
     * 
     */
    PUND,

    /**
     * Amount of money borrowed, or part of that amount which remains unpaid (excluding interest).
     * 
     */
    PWRD,

    /**
     * Financial instrument that gives the owner right to dividends paid by a company and the most junior claim on the companies assets in the event of a bankruptcy.
     * 
     */
    SHAS,

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
     * Unit of heat, often used a unit of measure for natural gas in the UK.
     * 
     */
    THMS,

    /**
     * Measure of weight, in Britain 2240lb (long ton)and in the US 2000lb (short ton).
     * 
     */
    TONS,

    /**
     * Unit of length equal to 1, 760 yards.
     * 
     */
    MILE,

    /**
     * Unit of mass equal to 1000 kilograms; equivalent to approximately 2,204.6 pounds, 1.102 short tons (US) or 0.984 long tons (imperial).
     * 
     */
    TONE,

    /**
     * Unit of length in the metric system, equal to 39.37 inches.
     * 
     */
    METR,

    /**
     * Unit of measure of the capacity of production of electric power equal to 1000000 watt in one year.
     * 
     */
    MWYC,

    /**
     * Unit of measure of the capacity of production of electric power equal to 1000000 watt in one month.
     * 
     */
    MMOC,

    /**
     * Unit of measure of the capacity of production of electric power equal to 1000000 watt in one minute.
     * 
     */
    MWMC,

    /**
     * Unit of measure of the capacity of production of electric power equal to 1000000 watt in one hour.
     * 
     */
    MWHC,

    /**
     * Unit of measure that is equal to the power consumption of one megawatt during one hour.
     * 
     */
    MWHO,

    /**
     * Unit of measure of the capacity of production of electric power equal to 1000000 watt in one day.
     * 
     */
    MWDC,

    /**
     * Indication of the unit of measurement.
     * 
     */
    LOTS,

    /**
     * Unit of volume that is equal to a thousand cubic centimetres.
     * 
     */
    LITR,

    /**
     * Unit of measure of the capacity of production of electric power equal to 1000 watt in one year.
     * 
     */
    KWYC,

    /**
     * Unit of measure of the capacity of production of electric power equal to 1000 watt in one month.
     * 
     */
    KWMC,

    /**
     * Unit of measure of the capacity of production of electric power equal to 1000 watt in one minute.
     * 
     */
    KMOC,

    /**
     * Unit of measure of the capacity of production of electric power equal to 1000 watt in one hour.
     * 
     */
    KWHC,

    /**
     * Unit of measure of the capacity of production of electric power equal to 1000 watt in one day.
     * 
     */
    KWDC,

    /**
     * Unit of measure that is equal to the power consumption of one kilowatt during one hour.
     * 
     */
    KWHO,

    /**
     * Unit of measure that is equal to 1, 000 meters.
     * 
     */
    KMET,

    /**
     * Basic unit of mass in the SI system, 1000 grams.
     * 
     */
    KILO,

    /**
     * Decimal number used to calculate an amount or a price.
     * 
     */
    IPNT,

    /**
     * Measure of length equal to 2.54 cm.
     * 
     */
    INCH,

    /**
     * Unit of weight or mass of various values in the Imperial Unit System also known as quintal, cental or centum.
     * 
     */
    HUWG,

    /**
     * Unit of measure that is equal to 10, 000 square meters.
     * 
     */
    HECT,

    /**
     * Unit of measure that is equal to a 1, 000th of a kilo.
     * 
     */
    GRAM,

    /**
     * Unit of measure that is equal to the power consumption of one Gigawatt during one hour.
     * 
     */
    GWHO,

    /**
     * Measure of weight, in Britain 2240 lb (long ton).
     * 
     */
    GBTN,

    /**
     * Unit of volume that is equal to 2 pints.
     * 
     */
    GBQA,

    /**
     * Unit of volume that is equal to 568 cubic centimetres.
     * 
     */
    GBPI,

    /**
     * Unit of weight equal to a sixteenth of a pound.
     * 
     */
    GBOU,

    /**
     * Unit of volume that is equal to 8 pints.
     * 
     */
    GBGA,

    /**
     * Unit of volume equal to 2, 841 306 centilitre.
     * 
     */
    GBFO,

    /**
     * Amount of fuel alternative equal to one gallon of gasoline.
     * 
     */
    GGEU,

    /**
     * Exchange traded contract that defines an agreement to buy specific quantities of a commodity or financial instrument at an agreed time in the future.
     * 
     */
    FUTU,

    /**
     * Unit of length equal to 1/3 yard.
     * 
     */
    FOOT,

    /**
     * Unit of measure for reduction of carbon dioxide emission (in metric ton) that may result in Environmental Credit.
     * 
     */
    ENVO,

    /**
     * Unit of measure for ownership of credit (or allowance) of carbon dioxide emission (in metric ton).
     * 
     */
    ENVC,

    /**
     * Unit of weight that is equal to the same mass value as a metric ton excluding moisture.
     * 
     */
    DMET,

    /**
     * Amount of fuel alternative equal to one gallon of diesel.
     * 
     */
    DGEU,

    /**
     * Unit of time that is equal to 24 hours.
     * 
     */
    DAYS,

    /**
     * Unit of volume that is equal to one thousandth of a litre.
     * 
     */
    CBML,

    /**
     * Unit of volume that is equal to one meter in length, breadth and height or also equal to 1000 liters.
     * 
     */
    CBME,

    /**
     * Measure of a volume, one inch by one inch by one inch.
     * 
     */
    CBIN,

    /**
     * Code for a crate.
     * 
     */
    CRAT,

    /**
     * Code for a container.
     * 
     */
    CNTR,

    /**
     * Unit of offset credits used by the Climate Action Reserve. One Climate Reserve Tonne is equal to one metric ton of Greenhouse Gas (GHG) reduced/sequestered.
     * 
     */
    CLRT,

    /**
     * Unit of emissions type (or carbon credits) issued by the Clean Development Mechanism (CDM) Executive Board for emission reductions achieved by CDM projects and verified by a DOE (Designated Operational Entity) under the rules of the Kyoto Protocol.
     * 
     */
    CEER,

    /**
     * Cooling degree day
     * 
     */
    CDDA,

    /**
     * Critical precipitation day
     * 
     */
    CPDA,

    /**
     * Heating degree day
     * 
     */
    HDDA;

    public String value() {
        return name();
    }

    public static UnitOfMeasure12Code fromValue(String v) {
        return valueOf(v);
    }

}
