
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitOfMeasure8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnitOfMeasure8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="KILO"/>
 *     <enumeration value="KMET"/>
 *     <enumeration value="KWDC"/>
 *     <enumeration value="KWHO"/>
 *     <enumeration value="KWHC"/>
 *     <enumeration value="KMOC"/>
 *     <enumeration value="KWMC"/>
 *     <enumeration value="KWYC"/>
 *     <enumeration value="LITR"/>
 *     <enumeration value="MWDC"/>
 *     <enumeration value="MWHO"/>
 *     <enumeration value="MWHC"/>
 *     <enumeration value="MWMC"/>
 *     <enumeration value="MMOC"/>
 *     <enumeration value="MWYC"/>
 *     <enumeration value="METR"/>
 *     <enumeration value="TONE"/>
 *     <enumeration value="MILE"/>
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
 *     <enumeration value="TOCD"/>
 *     <enumeration value="OZTR"/>
 *     <enumeration value="USGA"/>
 *     <enumeration value="UCWT"/>
 *     <enumeration value="USOU"/>
 *     <enumeration value="USPI"/>
 *     <enumeration value="USQA"/>
 *     <enumeration value="YARD"/>
 *     <enumeration value="ACRE"/>
 *     <enumeration value="ALOW"/>
 *     <enumeration value="ACCY"/>
 *     <enumeration value="ARES"/>
 *     <enumeration value="BARL"/>
 *     <enumeration value="BCUF"/>
 *     <enumeration value="BDFT"/>
 *     <enumeration value="BUSL"/>
 *     <enumeration value="CELI"/>
 *     <enumeration value="CMET"/>
 *     <enumeration value="CEER"/>
 *     <enumeration value="CLRT"/>
 *     <enumeration value="CBME"/>
 *     <enumeration value="DAYS"/>
 *     <enumeration value="DGEU"/>
 *     <enumeration value="DMET"/>
 *     <enumeration value="ENVC"/>
 *     <enumeration value="ENVO"/>
 *     <enumeration value="FOOT"/>
 *     <enumeration value="GGEU"/>
 *     <enumeration value="GBGA"/>
 *     <enumeration value="GBOU"/>
 *     <enumeration value="GBPI"/>
 *     <enumeration value="GBQA"/>
 *     <enumeration value="GRAM"/>
 *     <enumeration value="HECT"/>
 *     <enumeration value="HUWG"/>
 *     <enumeration value="INCH"/>
 *     <enumeration value="IPNT"/>
 *     <enumeration value="FUTU"/>
 *     <enumeration value="USTN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnitOfMeasure8Code")
@XmlEnum
public enum UnitOfMeasure8Code {


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
     * Unit of measure of the capacity of production of electric power equal to 1000 watt in one hour.
     * 
     */
    KWHC,

    /**
     * Unit of measure of the capacity of production of electric power equal to 1000 watt in one minute.
     * 
     */
    KMOC,

    /**
     * Unit of measure of the capacity of production of electric power equal to 1000 watt in one month.
     * 
     */
    KWMC,

    /**
     * Unit of measure of the capacity of production of electric power equal to 1000 watt in one year.
     * 
     */
    KWYC,

    /**
     * Unit of volume that is equal to a thousand cubic centimetres.
     * 
     */
    LITR,

    /**
     * Unit of measure of the capacity of production of electric power equal to 1000000 watt in one day.
     * 
     */
    MWDC,

    /**
     * Unit of measure that is equal to the power consumption of one megawatt during one hour.
     * 
     */
    MWHO,

    /**
     * Unit of measure of the capacity of production of electric power equal to 1000000 watt in one hour.
     * 
     */
    MWHC,

    /**
     * Unit of measure of the capacity of production of electric power equal to 1000000 watt in one minute.
     * 
     */
    MWMC,

    /**
     * Unit of measure of the capacity of production of electric power equal to 1000000 watt in one month.
     * 
     */
    MMOC,

    /**
     * Unit of measure of the capacity of production of electric power equal to 1000000 watt in one year.
     * 
     */
    MWYC,

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
     * Tons of carbon dioxide.
     * 
     */
    TOCD,

    /**
     * Unit of weight equal to 31.1034768 grams. Used in precious metals.
     * 
     */
    OZTR,

    /**
     * Unit of volume that is equal to 8 pints.
     * 
     */
    USGA,

    /**
     * Unit of weight or mass of various values in the US Customary System also known as quintal, cental or centum. Equal to 100 lbs.
     * 
     */
    UCWT,

    /**
     * Unit of weight equal to a sixteenth of a pound.
     * 
     */
    USOU,

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
     * Unit of length equal to 3 feet or 0.9144 metre.
     * 
     */
    YARD,

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
     * Unit of weight that is equal to 8 gallons. Mostly used for agricultural products with a specification of weight defined for each commodity differently.
     * 
     */
    BUSL,

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
     * Unit of emissions type (or carbon credits) issued by the Clean Development Mechanism (CDM) Executive Board for emission reductions achieved by CDM projects and verified by a DOE (Designated Operational Entity) under the rules of the Kyoto Protocol.
     * 
     */
    CEER,

    /**
     * Unit of offset credits used by the Climate Action Reserve. One Climate Reserve Tonne is equal to one metric ton of Greenhouse Gas (GHG) reduced/sequestered.
     * 
     */
    CLRT,

    /**
     * Unit of volume that is equal to one meter in length, breadth and height or also equal to 1000 liters.
     * 
     */
    CBME,

    /**
     * Unit of time that is equal to 24 hours.
     * 
     */
    DAYS,

    /**
     * Amount of fuel alternative equal to one gallon of diesel.
     * 
     */
    DGEU,

    /**
     * Unit of weight that is equal to the same mass value as a metric ton excluding moisture.
     * 
     */
    DMET,

    /**
     * Unit of measure for ownership of credit (or allowance) of carbon dioxide emission (in metric ton).
     * 
     */
    ENVC,

    /**
     * Unit of measure for reduction of carbon dioxide emission (in metric ton) that may result in Environmental Credit.
     * 
     */
    ENVO,

    /**
     * Unit of length equal to 1/3 yard.
     * 
     */
    FOOT,

    /**
     * Amount of fuel alternative equal to one gallon of gasoline.
     * 
     */
    GGEU,

    /**
     * Unit of volume that is equal to 8 pints.
     * 
     */
    GBGA,

    /**
     * Unit of weight equal to a sixteenth of a pound.
     * 
     */
    GBOU,

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
     * Unit of measure that is equal to a 1, 000th of a kilo.
     * 
     */
    GRAM,

    /**
     * Unit of measure that is equal to 10, 000 square meters.
     * 
     */
    HECT,

    /**
     * Unit of weight or mass of various values in the Imperial Unit System also known as quintal, cental or centum.
     * 
     */
    HUWG,

    /**
     * Measure of length equal to 2.54 cm.
     * 
     */
    INCH,

    /**
     * Decimal number used to calculate an amount or a price.
     * 
     */
    IPNT,

    /**
     * Exchange traded contract that defines an agreement to buy specific quantities of a commodity or financial instrument at an agreed time in the future.
     * 
     */
    FUTU,

    /**
     * Measure of weight, in the US 2000 lb (short ton).
     * 
     */
    USTN;

    public String value() {
        return name();
    }

    public static UnitOfMeasure8Code fromValue(String v) {
        return valueOf(v);
    }

}
