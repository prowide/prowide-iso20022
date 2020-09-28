
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Regroups identification parameters for trade items.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialItemParameters1", propOrder = {
    "idr",
    "isseDt",
    "rltdItm",
    "docPurp",
    "langCd",
    "issr",
    "rcpt",
    "buyr",
    "sellr",
    "sellrFinAgt",
    "buyrFinAgt",
    "govngCtrct",
    "lglCntxt",
    "ccy",
    "dbtAcct",
    "cdtAcct",
    "tradMkt"
})
public class FinancialItemParameters1Tsin01000101 {

    @XmlElement(name = "Idr", required = true)
    protected String idr;
    @XmlElement(name = "IsseDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
    @XmlElementRef(name = "RltdItm", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.010.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> rltdItm;
    @XmlElement(name = "DocPurp")
    protected String docPurp;
    @XmlElement(name = "LangCd")
    protected String langCd;
    @XmlElement(name = "Issr")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object issr;
    @XmlElement(name = "Rcpt")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object rcpt;
    @XmlElement(name = "Buyr")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object buyr;
    @XmlElement(name = "Sellr")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object sellr;
    @XmlElement(name = "SellrFinAgt")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object sellrFinAgt;
    @XmlElement(name = "BuyrFinAgt")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object buyrFinAgt;
    @XmlElementRef(name = "GovngCtrct", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.010.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> govngCtrct;
    @XmlElement(name = "LglCntxt")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object lglCntxt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "DbtAcct")
    protected AccountIdentification4Choice dbtAcct;
    @XmlElement(name = "CdtAcct")
    protected AccountIdentification4Choice cdtAcct;
    @XmlElement(name = "TradMkt")
    protected TradeMarket1Choice tradMkt;

    /**
     * Gets the value of the idr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdr() {
        return idr;
    }

    /**
     * Sets the value of the idr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialItemParameters1Tsin01000101 setIdr(String value) {
        this.idr = value;
        return this;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public FinancialItemParameters1Tsin01000101 setIsseDt(XMLGregorianCalendar value) {
        this.isseDt = value;
        return this;
    }

    /**
     * Gets the value of the rltdItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getRltdItm() {
        if (rltdItm == null) {
            rltdItm = new ArrayList<JAXBElement<Object>>();
        }
        return this.rltdItm;
    }

    /**
     * Gets the value of the docPurp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocPurp() {
        return docPurp;
    }

    /**
     * Sets the value of the docPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialItemParameters1Tsin01000101 setDocPurp(String value) {
        this.docPurp = value;
        return this;
    }

    /**
     * Gets the value of the langCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCd() {
        return langCd;
    }

    /**
     * Sets the value of the langCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialItemParameters1Tsin01000101 setLangCd(String value) {
        this.langCd = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public FinancialItemParameters1Tsin01000101 setIssr(Object value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the rcpt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRcpt() {
        return rcpt;
    }

    /**
     * Sets the value of the rcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public FinancialItemParameters1Tsin01000101 setRcpt(Object value) {
        this.rcpt = value;
        return this;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public FinancialItemParameters1Tsin01000101 setBuyr(Object value) {
        this.buyr = value;
        return this;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public FinancialItemParameters1Tsin01000101 setSellr(Object value) {
        this.sellr = value;
        return this;
    }

    /**
     * Gets the value of the sellrFinAgt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSellrFinAgt() {
        return sellrFinAgt;
    }

    /**
     * Sets the value of the sellrFinAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public FinancialItemParameters1Tsin01000101 setSellrFinAgt(Object value) {
        this.sellrFinAgt = value;
        return this;
    }

    /**
     * Gets the value of the buyrFinAgt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBuyrFinAgt() {
        return buyrFinAgt;
    }

    /**
     * Sets the value of the buyrFinAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public FinancialItemParameters1Tsin01000101 setBuyrFinAgt(Object value) {
        this.buyrFinAgt = value;
        return this;
    }

    /**
     * Gets the value of the govngCtrct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the govngCtrct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGovngCtrct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getGovngCtrct() {
        if (govngCtrct == null) {
            govngCtrct = new ArrayList<JAXBElement<Object>>();
        }
        return this.govngCtrct;
    }

    /**
     * Gets the value of the lglCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLglCntxt() {
        return lglCntxt;
    }

    /**
     * Sets the value of the lglCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public FinancialItemParameters1Tsin01000101 setLglCntxt(Object value) {
        this.lglCntxt = value;
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
    public FinancialItemParameters1Tsin01000101 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the dbtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getDbtAcct() {
        return dbtAcct;
    }

    /**
     * Sets the value of the dbtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public FinancialItemParameters1Tsin01000101 setDbtAcct(AccountIdentification4Choice value) {
        this.dbtAcct = value;
        return this;
    }

    /**
     * Gets the value of the cdtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getCdtAcct() {
        return cdtAcct;
    }

    /**
     * Sets the value of the cdtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public FinancialItemParameters1Tsin01000101 setCdtAcct(AccountIdentification4Choice value) {
        this.cdtAcct = value;
        return this;
    }

    /**
     * Gets the value of the tradMkt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeMarket1Choice }
     *     
     */
    public TradeMarket1Choice getTradMkt() {
        return tradMkt;
    }

    /**
     * Sets the value of the tradMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeMarket1Choice }
     *     
     */
    public FinancialItemParameters1Tsin01000101 setTradMkt(TradeMarket1Choice value) {
        this.tradMkt = value;
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

    /**
     * Adds a new item to the rltdItm list.
     * @see #getRltdItm()
     * 
     */
    public FinancialItemParameters1Tsin01000101 addRltdItm(JAXBElement<Object> rltdItm) {
        getRltdItm().add(rltdItm);
        return this;
    }

    /**
     * Adds a new item to the govngCtrct list.
     * @see #getGovngCtrct()
     * 
     */
    public FinancialItemParameters1Tsin01000101 addGovngCtrct(JAXBElement<Object> govngCtrct) {
        getGovngCtrct().add(govngCtrct);
        return this;
    }

}
