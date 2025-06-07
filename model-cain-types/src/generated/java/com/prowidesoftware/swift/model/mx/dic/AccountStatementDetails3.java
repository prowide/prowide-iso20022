
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Statement information of an account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountStatementDetails3", propOrder = {
    "txDt",
    "pdg",
    "pstngDt",
    "cdtDbt",
    "amt",
    "ccy",
    "crdhldrBllgAmt",
    "crdhldrBllgCcy",
    "accptrNmAndLctn",
    "shrtDesc",
    "lngDesc"
})
public class AccountStatementDetails3 {

    @XmlElement(name = "TxDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar txDt;
    @XmlElement(name = "Pdg")
    protected Boolean pdg;
    @XmlElement(name = "PstngDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pstngDt;
    @XmlElement(name = "CdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code cdtDbt;
    @XmlElement(name = "Amt")
    protected BigDecimal amt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "CrdhldrBllgAmt")
    protected BigDecimal crdhldrBllgAmt;
    @XmlElement(name = "CrdhldrBllgCcy")
    protected String crdhldrBllgCcy;
    @XmlElement(name = "AccptrNmAndLctn")
    protected String accptrNmAndLctn;
    @XmlElement(name = "ShrtDesc")
    protected String shrtDesc;
    @XmlElement(name = "LngDesc")
    protected String lngDesc;

    /**
     * Gets the value of the txDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTxDt() {
        return txDt;
    }

    /**
     * Sets the value of the txDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountStatementDetails3 setTxDt(XMLGregorianCalendar value) {
        this.txDt = value;
        return this;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AccountStatementDetails3 setPdg(Boolean value) {
        this.pdg = value;
        return this;
    }

    /**
     * Gets the value of the pstngDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getPstngDt() {
        return pstngDt;
    }

    /**
     * Sets the value of the pstngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountStatementDetails3 setPstngDt(XMLGregorianCalendar value) {
        this.pstngDt = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getCdtDbt() {
        return cdtDbt;
    }

    /**
     * Sets the value of the cdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public AccountStatementDetails3 setCdtDbt(CreditDebit3Code value) {
        this.cdtDbt = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public AccountStatementDetails3 setAmt(BigDecimal value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountStatementDetails3 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrBllgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCrdhldrBllgAmt() {
        return crdhldrBllgAmt;
    }

    /**
     * Sets the value of the crdhldrBllgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public AccountStatementDetails3 setCrdhldrBllgAmt(BigDecimal value) {
        this.crdhldrBllgAmt = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrBllgCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdhldrBllgCcy() {
        return crdhldrBllgCcy;
    }

    /**
     * Sets the value of the crdhldrBllgCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountStatementDetails3 setCrdhldrBllgCcy(String value) {
        this.crdhldrBllgCcy = value;
        return this;
    }

    /**
     * Gets the value of the accptrNmAndLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccptrNmAndLctn() {
        return accptrNmAndLctn;
    }

    /**
     * Sets the value of the accptrNmAndLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountStatementDetails3 setAccptrNmAndLctn(String value) {
        this.accptrNmAndLctn = value;
        return this;
    }

    /**
     * Gets the value of the shrtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtDesc() {
        return shrtDesc;
    }

    /**
     * Sets the value of the shrtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountStatementDetails3 setShrtDesc(String value) {
        this.shrtDesc = value;
        return this;
    }

    /**
     * Gets the value of the lngDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLngDesc() {
        return lngDesc;
    }

    /**
     * Sets the value of the lngDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountStatementDetails3 setLngDesc(String value) {
        this.lngDesc = value;
        return this;
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

}
