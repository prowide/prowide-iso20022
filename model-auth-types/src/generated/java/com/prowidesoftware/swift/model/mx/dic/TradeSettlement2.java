
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Trade settlement details for this invoice which involves the payment of an outstanding debt, account, or charge
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeSettlement2", propOrder = {
    "pmtRef",
    "dueDt",
    "duePyblAmt",
    "invcCcyXchg",
    "dlvryDt",
    "bllgPrd",
    "taxTtlAmt",
    "xmptnRsnCd",
    "xmptnRsn",
    "subTtlClctdTax",
    "earlyPmts"
})
public class TradeSettlement2 {

    @XmlElement(name = "PmtRef")
    protected CreditorReferenceInformation2 pmtRef;
    @XmlElement(name = "DueDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDt;
    @XmlElement(name = "DuePyblAmt", required = true)
    protected CurrencyAndAmount duePyblAmt;
    @XmlElement(name = "InvcCcyXchg")
    protected CurrencyReference3 invcCcyXchg;
    @XmlElement(name = "DlvryDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dlvryDt;
    @XmlElement(name = "BllgPrd")
    protected Period2 bllgPrd;
    @XmlElement(name = "TaxTtlAmt", required = true)
    protected CurrencyAndAmount taxTtlAmt;
    @XmlElement(name = "XmptnRsnCd")
    protected String xmptnRsnCd;
    @XmlElement(name = "XmptnRsn")
    protected String xmptnRsn;
    @XmlElement(name = "SubTtlClctdTax")
    protected List<SettlementSubTotalCalculatedTax2> subTtlClctdTax;
    @XmlElement(name = "EarlyPmts")
    protected List<EarlyPayment1> earlyPmts;

    /**
     * Gets the value of the pmtRef property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorReferenceInformation2 }
     *     
     */
    public CreditorReferenceInformation2 getPmtRef() {
        return pmtRef;
    }

    /**
     * Sets the value of the pmtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorReferenceInformation2 }
     *     
     */
    public TradeSettlement2 setPmtRef(CreditorReferenceInformation2 value) {
        this.pmtRef = value;
        return this;
    }

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeSettlement2 setDueDt(XMLGregorianCalendar value) {
        this.dueDt = value;
        return this;
    }

    /**
     * Gets the value of the duePyblAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getDuePyblAmt() {
        return duePyblAmt;
    }

    /**
     * Sets the value of the duePyblAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public TradeSettlement2 setDuePyblAmt(CurrencyAndAmount value) {
        this.duePyblAmt = value;
        return this;
    }

    /**
     * Gets the value of the invcCcyXchg property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyReference3 }
     *     
     */
    public CurrencyReference3 getInvcCcyXchg() {
        return invcCcyXchg;
    }

    /**
     * Sets the value of the invcCcyXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyReference3 }
     *     
     */
    public TradeSettlement2 setInvcCcyXchg(CurrencyReference3 value) {
        this.invcCcyXchg = value;
        return this;
    }

    /**
     * Gets the value of the dlvryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDlvryDt() {
        return dlvryDt;
    }

    /**
     * Sets the value of the dlvryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeSettlement2 setDlvryDt(XMLGregorianCalendar value) {
        this.dlvryDt = value;
        return this;
    }

    /**
     * Gets the value of the bllgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period2 }
     *     
     */
    public Period2 getBllgPrd() {
        return bllgPrd;
    }

    /**
     * Sets the value of the bllgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period2 }
     *     
     */
    public TradeSettlement2 setBllgPrd(Period2 value) {
        this.bllgPrd = value;
        return this;
    }

    /**
     * Gets the value of the taxTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTaxTtlAmt() {
        return taxTtlAmt;
    }

    /**
     * Sets the value of the taxTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public TradeSettlement2 setTaxTtlAmt(CurrencyAndAmount value) {
        this.taxTtlAmt = value;
        return this;
    }

    /**
     * Gets the value of the xmptnRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmptnRsnCd() {
        return xmptnRsnCd;
    }

    /**
     * Sets the value of the xmptnRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeSettlement2 setXmptnRsnCd(String value) {
        this.xmptnRsnCd = value;
        return this;
    }

    /**
     * Gets the value of the xmptnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmptnRsn() {
        return xmptnRsn;
    }

    /**
     * Sets the value of the xmptnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeSettlement2 setXmptnRsn(String value) {
        this.xmptnRsn = value;
        return this;
    }

    /**
     * Gets the value of the subTtlClctdTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subTtlClctdTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubTtlClctdTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementSubTotalCalculatedTax2 }
     * 
     * 
     */
    public List<SettlementSubTotalCalculatedTax2> getSubTtlClctdTax() {
        if (subTtlClctdTax == null) {
            subTtlClctdTax = new ArrayList<SettlementSubTotalCalculatedTax2>();
        }
        return this.subTtlClctdTax;
    }

    /**
     * Gets the value of the earlyPmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the earlyPmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEarlyPmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EarlyPayment1 }
     * 
     * 
     */
    public List<EarlyPayment1> getEarlyPmts() {
        if (earlyPmts == null) {
            earlyPmts = new ArrayList<EarlyPayment1>();
        }
        return this.earlyPmts;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the subTtlClctdTax list.
     * @see #getSubTtlClctdTax()
     * 
     */
    public TradeSettlement2 addSubTtlClctdTax(SettlementSubTotalCalculatedTax2 subTtlClctdTax) {
        getSubTtlClctdTax().add(subTtlClctdTax);
        return this;
    }

    /**
     * Adds a new item to the earlyPmts list.
     * @see #getEarlyPmts()
     * 
     */
    public TradeSettlement2 addEarlyPmts(EarlyPayment1 earlyPmts) {
        getEarlyPmts().add(earlyPmts);
        return this;
    }

}
