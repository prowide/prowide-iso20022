
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
 * Specifies the account within a system to or from which a securities entry is made. It holds information generic or market specific attributes such as opening or closing date, and defines the default setting for the  holding of settlement instructions involving positions related to the account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemSecuritiesAccount6", propOrder = {
    "opngDt",
    "clsgDt",
    "hldInd",
    "negPos",
    "tp",
    "acctOwnr",
    "ptyTp",
    "mktSpcfcAttr",
    "rstrctn",
    "endInvstrFlg",
    "pricgSchme"
})
public class SystemSecuritiesAccount6 {

    @XmlElement(name = "OpngDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar opngDt;
    @XmlElement(name = "ClsgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clsgDt;
    @XmlElement(name = "HldInd")
    protected Boolean hldInd;
    @XmlElement(name = "NegPos")
    protected Boolean negPos;
    @XmlElement(name = "Tp")
    protected SystemSecuritiesAccountType1Choice tp;
    @XmlElement(name = "AcctOwnr", required = true)
    protected SystemPartyIdentification8 acctOwnr;
    @XmlElement(name = "PtyTp")
    protected SystemPartyType1Choice ptyTp;
    @XmlElement(name = "MktSpcfcAttr")
    protected List<MarketSpecificAttribute1> mktSpcfcAttr;
    @XmlElement(name = "Rstrctn")
    protected List<SystemRestriction1> rstrctn;
    @XmlElement(name = "EndInvstrFlg")
    protected String endInvstrFlg;
    @XmlElement(name = "PricgSchme")
    protected String pricgSchme;

    /**
     * Gets the value of the opngDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getOpngDt() {
        return opngDt;
    }

    /**
     * Sets the value of the opngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SystemSecuritiesAccount6 setOpngDt(XMLGregorianCalendar value) {
        this.opngDt = value;
        return this;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SystemSecuritiesAccount6 setClsgDt(XMLGregorianCalendar value) {
        this.clsgDt = value;
        return this;
    }

    /**
     * Gets the value of the hldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHldInd() {
        return hldInd;
    }

    /**
     * Sets the value of the hldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SystemSecuritiesAccount6 setHldInd(Boolean value) {
        this.hldInd = value;
        return this;
    }

    /**
     * Gets the value of the negPos property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegPos() {
        return negPos;
    }

    /**
     * Sets the value of the negPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SystemSecuritiesAccount6 setNegPos(Boolean value) {
        this.negPos = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link SystemSecuritiesAccountType1Choice }
     *     
     */
    public SystemSecuritiesAccountType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemSecuritiesAccountType1Choice }
     *     
     */
    public SystemSecuritiesAccount6 setTp(SystemSecuritiesAccountType1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemPartyIdentification8 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemSecuritiesAccount6 setAcctOwnr(SystemPartyIdentification8 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the ptyTp property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyType1Choice }
     *     
     */
    public SystemPartyType1Choice getPtyTp() {
        return ptyTp;
    }

    /**
     * Sets the value of the ptyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyType1Choice }
     *     
     */
    public SystemSecuritiesAccount6 setPtyTp(SystemPartyType1Choice value) {
        this.ptyTp = value;
        return this;
    }

    /**
     * Gets the value of the mktSpcfcAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mktSpcfcAttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMktSpcfcAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketSpecificAttribute1 }
     * 
     * 
     */
    public List<MarketSpecificAttribute1> getMktSpcfcAttr() {
        if (mktSpcfcAttr == null) {
            mktSpcfcAttr = new ArrayList<MarketSpecificAttribute1>();
        }
        return this.mktSpcfcAttr;
    }

    /**
     * Gets the value of the rstrctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rstrctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRstrctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemRestriction1 }
     * 
     * 
     */
    public List<SystemRestriction1> getRstrctn() {
        if (rstrctn == null) {
            rstrctn = new ArrayList<SystemRestriction1>();
        }
        return this.rstrctn;
    }

    /**
     * Gets the value of the endInvstrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndInvstrFlg() {
        return endInvstrFlg;
    }

    /**
     * Sets the value of the endInvstrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SystemSecuritiesAccount6 setEndInvstrFlg(String value) {
        this.endInvstrFlg = value;
        return this;
    }

    /**
     * Gets the value of the pricgSchme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricgSchme() {
        return pricgSchme;
    }

    /**
     * Sets the value of the pricgSchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SystemSecuritiesAccount6 setPricgSchme(String value) {
        this.pricgSchme = value;
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
     * Adds a new item to the mktSpcfcAttr list.
     * @see #getMktSpcfcAttr()
     * 
     */
    public SystemSecuritiesAccount6 addMktSpcfcAttr(MarketSpecificAttribute1 mktSpcfcAttr) {
        getMktSpcfcAttr().add(mktSpcfcAttr);
        return this;
    }

    /**
     * Adds a new item to the rstrctn list.
     * @see #getRstrctn()
     * 
     */
    public SystemSecuritiesAccount6 addRstrctn(SystemRestriction1 rstrctn) {
        getRstrctn().add(rstrctn);
        return this;
    }

}
