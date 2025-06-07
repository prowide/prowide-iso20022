
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddendumTaxType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddendumTaxType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TOTL"/&gt;
 *     &lt;enumeration value="ALMI"/&gt;
 *     &lt;enumeration value="ASNT"/&gt;
 *     &lt;enumeration value="BPTX"/&gt;
 *     &lt;enumeration value="KAPA"/&gt;
 *     &lt;enumeration value="NKAP"/&gt;
 *     &lt;enumeration value="CRTX"/&gt;
 *     &lt;enumeration value="CSTX"/&gt;
 *     &lt;enumeration value="CITX"/&gt;
 *     &lt;enumeration value="COAX"/&gt;
 *     &lt;enumeration value="CPST"/&gt;
 *     &lt;enumeration value="CORT"/&gt;
 *     &lt;enumeration value="COTX"/&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *     &lt;enumeration value="DLTX"/&gt;
 *     &lt;enumeration value="DUTY"/&gt;
 *     &lt;enumeration value="EMIT"/&gt;
 *     &lt;enumeration value="EMUT"/&gt;
 *     &lt;enumeration value="EMET"/&gt;
 *     &lt;enumeration value="EMST"/&gt;
 *     &lt;enumeration value="EMRT"/&gt;
 *     &lt;enumeration value="ENTX"/&gt;
 *     &lt;enumeration value="ESET"/&gt;
 *     &lt;enumeration value="ENVT"/&gt;
 *     &lt;enumeration value="EQUL"/&gt;
 *     &lt;enumeration value="EQTX"/&gt;
 *     &lt;enumeration value="EUTR"/&gt;
 *     &lt;enumeration value="EXEC"/&gt;
 *     &lt;enumeration value="FEXT"/&gt;
 *     &lt;enumeration value="FNST"/&gt;
 *     &lt;enumeration value="FETX"/&gt;
 *     &lt;enumeration value="FVAT"/&gt;
 *     &lt;enumeration value="FVTS"/&gt;
 *     &lt;enumeration value="FIMT"/&gt;
 *     &lt;enumeration value="FSST"/&gt;
 *     &lt;enumeration value="FICA"/&gt;
 *     &lt;enumeration value="FRTX"/&gt;
 *     &lt;enumeration value="FSTX"/&gt;
 *     &lt;enumeration value="FSFT"/&gt;
 *     &lt;enumeration value="FUVT"/&gt;
 *     &lt;enumeration value="GIFT"/&gt;
 *     &lt;enumeration value="GCAT"/&gt;
 *     &lt;enumeration value="GRTX"/&gt;
 *     &lt;enumeration value="HVAT"/&gt;
 *     &lt;enumeration value="HATX"/&gt;
 *     &lt;enumeration value="HSTX"/&gt;
 *     &lt;enumeration value="HWTX"/&gt;
 *     &lt;enumeration value="INHT"/&gt;
 *     &lt;enumeration value="INPO"/&gt;
 *     &lt;enumeration value="LTTX"/&gt;
 *     &lt;enumeration value="FLST"/&gt;
 *     &lt;enumeration value="LITX"/&gt;
 *     &lt;enumeration value="LOCO"/&gt;
 *     &lt;enumeration value="LSTX"/&gt;
 *     &lt;enumeration value="LOCL"/&gt;
 *     &lt;enumeration value="LUTX"/&gt;
 *     &lt;enumeration value="MATX"/&gt;
 *     &lt;enumeration value="METX"/&gt;
 *     &lt;enumeration value="MITX"/&gt;
 *     &lt;enumeration value="MUTX"/&gt;
 *     &lt;enumeration value="MUDE"/&gt;
 *     &lt;enumeration value="COUN"/&gt;
 *     &lt;enumeration value="NATI"/&gt;
 *     &lt;enumeration value="OCTX"/&gt;
 *     &lt;enumeration value="OPTX"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTTX"/&gt;
 *     &lt;enumeration value="LEVY"/&gt;
 *     &lt;enumeration value="POTX"/&gt;
 *     &lt;enumeration value="PRTX"/&gt;
 *     &lt;enumeration value="PSTX"/&gt;
 *     &lt;enumeration value="PPTX"/&gt;
 *     &lt;enumeration value="PROV"/&gt;
 *     &lt;enumeration value="PHET"/&gt;
 *     &lt;enumeration value="QUST"/&gt;
 *     &lt;enumeration value="ROCI"/&gt;
 *     &lt;enumeration value="RCSB"/&gt;
 *     &lt;enumeration value="RCSD"/&gt;
 *     &lt;enumeration value="ROTX"/&gt;
 *     &lt;enumeration value="RVAT"/&gt;
 *     &lt;enumeration value="ROVI"/&gt;
 *     &lt;enumeration value="SAUT"/&gt;
 *     &lt;enumeration value="SCTX"/&gt;
 *     &lt;enumeration value="SPTX"/&gt;
 *     &lt;enumeration value="STTA"/&gt;
 *     &lt;enumeration value="STAM"/&gt;
 *     &lt;enumeration value="SLST"/&gt;
 *     &lt;enumeration value="SLTX"/&gt;
 *     &lt;enumeration value="SETX"/&gt;
 *     &lt;enumeration value="STPT"/&gt;
 *     &lt;enumeration value="SPTS"/&gt;
 *     &lt;enumeration value="SPFT"/&gt;
 *     &lt;enumeration value="SPTG"/&gt;
 *     &lt;enumeration value="SRTX"/&gt;
 *     &lt;enumeration value="SSTX"/&gt;
 *     &lt;enumeration value="STAT"/&gt;
 *     &lt;enumeration value="STSL"/&gt;
 *     &lt;enumeration value="STEX"/&gt;
 *     &lt;enumeration value="SUTX"/&gt;
 *     &lt;enumeration value="CTAX"/&gt;
 *     &lt;enumeration value="TDDT"/&gt;
 *     &lt;enumeration value="TELT"/&gt;
 *     &lt;enumeration value="THTX"/&gt;
 *     &lt;enumeration value="TRAX"/&gt;
 *     &lt;enumeration value="TRAN"/&gt;
 *     &lt;enumeration value="UNSP"/&gt;
 *     &lt;enumeration value="UUTX"/&gt;
 *     &lt;enumeration value="VATA"/&gt;
 *     &lt;enumeration value="VATB"/&gt;
 *     &lt;enumeration value="WTAX"/&gt;
 *     &lt;enumeration value="WESV"/&gt;
 *     &lt;enumeration value="WITF"/&gt;
 *     &lt;enumeration value="WITL"/&gt;
 *     &lt;enumeration value="WITH"/&gt;
 *     &lt;enumeration value="TNRT"/&gt;
 *     &lt;enumeration value="DPTX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AddendumTaxType3Code")
@XmlEnum
public enum AddendumTaxType3Code {


    /**
     * Total of all applicable taxes
     * 
     */
    TOTL,

    /**
     * Tax is an alternative minimum tax.
     * 
     */
    ALMI,

    /**
     * Assessment
     * 
     */
    ASNT,

    /**
     * Tax imposed on non-American Indian businesses for the privilege of conducting business on an American Indian Reservation
     * 
     */
    BPTX,

    /**
     * Tax is on a capital gain (realised and unrealised), that is, the profit that is gained from the sale of a financial instrument.
     * 
     */
    KAPA,

    /**
     * Tax recovery is due to capital loss.
     * 
     */
    NKAP,

    /**
     * Levied by a city government against the periodic fee paid by a customer in return for the right to use the property of another party.
     * 
     */
    CRTX,

    /**
     * Sales tax imposed by a city
     * 
     */
    CSTX,

    /**
     * Service tax imposed by a city
     * 
     */
    CITX,

    /**
     * Tax that is levied on goods and services purchased by customers, and is added to the retail price.
     * 
     */
    COAX,

    /**
     * Service tax imposed by a County or Parish
     * 
     */
    CPST,

    /**
     * Levied by a county government against the periodic fee paid by a customer in return for the right to use the property of another party.
     * 
     */
    CORT,

    /**
     * Service tax levied by a county
     * 
     */
    COTX,

    /**
     * Tax levied on imports or exports by a country's customs authority. 
     * 
     */
    CUST,

    /**
     * Default Labour Tax
     * 
     */
    DLTX,

    /**
     * A tax levied on goods that typically though not exclusively transit across a geographic border. 
     * 
     */
    DUTY,

    /**
     * Tax levied by a city to recover the cost of providing telephone emergency assistance service (for example, 112, 911, 999).
     * 
     */
    EMIT,

    /**
     * Tax levied by a county to recover the cost of providing telephone emergency assistance service (for example, 112, 911, 999).
     * 
     */
    EMUT,

    /**
     * Usage tax levied to recover the cost of telephone emergency assistance service (for example, 112, 911, 999).
     * 
     */
    EMET,

    /**
     * Tax levied by a state to recover the cost of providing telephone emergency assistance service (for example, 112, 911, 999).
     * 
     */
    EMST,

    /**
     * Tax levied to recover the cost of providing telephone emergency assistance service (for example,112, 911, 999).
     * 
     */
    EMRT,

    /**
     * Tax applied to the utility and petroleum industries. 
     * 
     */
    ENTX,

    /**
     * Tax levied by a state to recover the cost of providing enhanced telephone emergency assistance services (for example, 112, 911, 999) such as automatic call identification.
     * 
     */
    ESET,

    /**
     * Tax levied on activities which are considered to have negative impacts on an environment. 
     * 
     */
    ENVT,

    /**
     * Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year.
     * 
     */
    EQUL,

    /**
     * Equipment Tax
     * 
     */
    EQTX,

    /**
     * Tax withheld at source in the framework of the European Directive on taxation of savings in the form of interest payments.
     * 
     */
    EUTR,

    /**
     * Executing broker's commission amount.
     * 
     */
    EXEC,

    /**
     * Excise tax levied by a federal government.
     * 
     */
    FEXT,

    /**
     * Federal or National Sales Tax.
     * 
     */
    FNST,

    /**
     * Usage tax levied by federal (US and Canadian) government.
     * 
     */
    FETX,

    /**
     * Federal Value-Added Tax (GST).
     * 
     */
    FVAT,

    /**
     * Federal Value-Added Tax (GST) on Services
     * 
     */
    FVTS,

    /**
     * USA Federal Insurance Contributions Act tax levied to assist in the funding of Medicare.
     * 
     */
    FIMT,

    /**
     * USA Federal Insurance Contributions Act tax levied to assist in the funding of social security.
     * 
     */
    FSST,

    /**
     * USA Federal Insurance Contributions Act tax.
     * 
     */
    FICA,

    /**
     * Tax levied by a municipality, on certain types of businesses for the right to exist as a legal entity and conduct business in a particular jurisdiction. 
     * 
     */
    FRTX,

    /**
     * Fuel Spill Tax.
     * 
     */
    FSTX,

    /**
     * USA federal tax levied on certain types of businesses to provide funding for cleanup of hazardous waste sites. 
     * 
     */
    FSFT,

    /**
     * Value Added Tax calculated at the full tax rate.
     * 
     */
    FUVT,

    /**
     * Tax that is levied on assets given to individuals prior to the death of the donor. Gift tax is designed to ensure the integrity of the inheritance tax, preventing the pre-death transfer of wealth.
     * 
     */
    GIFT,

    /**
     * Goods and Services Tax - Canadian value-added tax.
     * 
     */
    GCAT,

    /**
     * Gross Receipts Tax.
     * 
     */
    GRTX,

    /**
     * Value Added Tax calculated at the half tax rate.
     * 
     */
    HVAT,

    /**
     * Tax assessed to assist the handicapped.
     * 
     */
    HATX,

    /**
     * Harmonized Sales Tax (HST).
     * 
     */
    HSTX,

    /**
     * Tax levied on entities that produce, store, treat, transport or otherwise manage hazardous wastes and materials.
     * 
     */
    HWTX,

    /**
     * Tax that is payable at the time of death on any items (money or otherwise), where ownership changes either upon death or within a legally specified number of years before death.
     * 
     */
    INHT,

    /**
     * Tax levied on the sum of all earnings/revenues accrued since the last dividend distribution.
     * 
     */
    INPO,

    /**
     * Labour by Trade Tax
     * 
     */
    LTTX,

    /**
     * Federal tax levied in the USA to fund the clean-up activities associated with leaking underground storage tanks.
     * 
     */
    FLST,

    /**
     * Tax levied by a government agency for the granting of a license to conduct an activity, such as driving a car, operating a business, selling liquor, hunting, or practicing certain vocations.
     * 
     */
    LITX,

    /**
     * Local broker's commission amount.
     * 
     */
    LOCO,

    /**
     * All applicable sales taxes levied by taxing authorities below the state level. Used only for sales tax. 
     * 
     */
    LSTX,

    /**
     * Service tax levied by a local government or taxation agency. Not a sales tax. 
     * 
     */
    LOCL,

    /**
     * Ad valorem tax levied on products or services that are deemed to be non-essential or unneeded.
     * 
     */
    LUTX,

    /**
     * Material Tax
     * 
     */
    MATX,

    /**
     * Metropolitan Transit Tax
     * 
     */
    METX,

    /**
     * Minimum Tax
     * 
     */
    MITX,

    /**
     * Service tax imposed by a municipality.
     * 
     */
    MUTX,

    /**
     * Mutually Defined
     * 
     */
    MUDE,

    /**
     * Tax is a country, national, or federal tax usually levied by the custodian.
     * 
     */
    COUN,

    /**
     * Tax is a national tax.
     * 
     */
    NATI,

    /**
     * Tax levied for the privelage of occupying space for home or rental for a fixed period of time, as determined by a taxing authority. 
     * 
     * 
     */
    OCTX,

    /**
     * Type of gross receipts tax imposed for the privilege of carrying on a business, trade or profession.
     * 
     * 
     */
    OPTX,

    /**
     * Other type of tax not elsewhere classified.
     * 
     */
    OTHR,

    /**
     * Other national use defined value
     * 
     */
    OTHN,

    /**
     * Other private use defined value
     * 
     */
    OTHP,

    /**
     * Other taxes
     * 
     */
    OTTX,

    /**
     * Tax levied on a payment.
     * 
     */
    LEVY,

    /**
     * Post-threshold Tax
     * 
     */
    POTX,

    /**
     * Pre-threshold tax
     * 
     */
    PRTX,

    /**
     * Tax levied on products and services
     * 
     */
    PSTX,

    /**
     * Ad valorem property tax levied on real or personal property by local government units such as counties, municipalities, school districts, and special taxing districts.
     * 
     */
    PPTX,

    /**
     * Provincial tax
     * 
     */
    PROV,

    /**
     * Canadian tax levied to fund public care and education. 
     * 
     */
    PHET,

    /**
     * Quebec Sales Tax (QST)
     * 
     */
    QUST,

    /**
     * Room City
     * 
     */
    ROCI,

    /**
     * Room Country Subdivision1
     * 
     */
    RCSB,

    /**
     * Room Country Subdivision2
     * 
     */
    RCSD,

    /**
     * Room Tax
     * 
     */
    ROTX,

    /**
     * Room VAT
     * 
     */
    RVAT,

    /**
     * Room Visitor
     * 
     */
    ROVI,

    /**
     * Tax levied for the use of equipment and service provided
     * 
     */
    SAUT,

    /**
     * Tax levied by taxing authority for schools
     * 
     */
    SCTX,

    /**
     * Secondary Percentage Tax
     * 
     */
    SPTX,

    /**
     * Stadium Tax
     * 
     */
    STTA,

    /**
     * Tax levied on certain types of documents and transactions.
     * 
     */
    STAM,

    /**
     * State and Local Sales Tax
     * 
     */
    SLST,

    /**
     * State and local tax levies, exclusive of state and local sales tax. 
     * 
     */
    SLTX,

    /**
     * Usage tax imposed by state or provincial government authorities.
     * 
     */
    SETX,

    /**
     * Sales tax levied by a State or Province that excludes sales or excise taxes.
     * 
     */
    STPT,

    /**
     * State or Provincial tax on services
     * 
     */
    SPTS,

    /**
     * State or Provincial Fuel Tax
     * 
     */
    SPFT,

    /**
     * State or Provincial Tax on Goods
     * 
     */
    SPTG,

    /**
     * Tax levied by a state government against a periodic fee paid by a customer in return for the right to use the property of another party.
     * 
     */
    SRTX,

    /**
     * State Sales Tax
     * 
     */
    SSTX,

    /**
     * State tax.
     * 
     */
    STAT,

    /**
     * State Tax on Specific Labour
     * 
     */
    STSL,

    /**
     * Tax levied by a stock exchange.
     * 
     */
    STEX,

    /**
     * Surtax
     * 
     */
    SUTX,

    /**
     * Direct reduction of an individual's tax liability.
     * 
     */
    CTAX,

    /**
     * Excise tax levied to recover the cost of providing Telecommunications Device for the Deaf (TDD) Equipment. 
     * 
     */
    TDDT,

    /**
     * Tax levied on telecommunications companies for the right to provide services. May be a usage or excise tax.
     * 
     */
    TELT,

    /**
     * Threshold Tax
     * 
     */
    THTX,

    /**
     * Tax levied on a transaction.
     * 
     */
    TRAX,

    /**
     * Tax levied on a transfer.
     * 
     */
    TRAN,

    /**
     * Unspecified tax type
     * 
     */
    UNSP,

    /**
     * Tax levied on consumers by a city or county for the use of natural gas. 
     * 
     */
    UUTX,

    /**
     * Value added tax
     * 
     */
    VATA,

    /**
     * Tax for which a zero rate applies.
     * 
     */
    VATB,

    /**
     * Tax levied only when the value of assets or categories of assets owned by an entity are above a given limit as defined by the tax authority. Wealth tax is not linked to income.
     * 
     */
    WTAX,

    /**
     * Well Service
     * 
     */
    WESV,

    /**
     * Rate at which the income will be withheld by the jurisdiction in which the income was originally paid, for which relief at source and/or reclaim may be possible.
     * 
     */
    WITF,

    /**
     * Rate at which the income will be withheld by the jurisdiction in which the account owner is located, for which relief at source and/or reclaim may be possible.
     * 
     */
    WITL,

    /**
     * Income tax withheld or deducted from the amount due to the recipient, and paid to the government by the payer rather than the recipient. May apply to salaries, interest, and other types of proceeds. 
     * 
     */
    WITH,

    /**
     * Tax levied on non-room expenditures.
     * 
     */
    TNRT,

    /**
     * Departure Tax
     * 
     */
    DPTX;

    public String value() {
        return name();
    }

    public static AddendumTaxType3Code fromValue(String v) {
        return valueOf(v);
    }

}
