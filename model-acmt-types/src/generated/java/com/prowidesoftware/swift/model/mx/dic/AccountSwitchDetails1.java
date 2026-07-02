
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
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the account switch, including its status and any response codes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSwitchDetails1", propOrder = {
    "unqRefNb",
    "rtgUnqRefNb",
    "swtchRcvdDtTm",
    "swtchDt",
    "swtchTp",
    "swtchSts",
    "balTrfWndw",
    "rspn"
})
public class AccountSwitchDetails1 {

    @XmlElement(name = "UnqRefNb", required = true)
    protected String unqRefNb;
    @XmlElement(name = "RtgUnqRefNb", required = true)
    protected String rtgUnqRefNb;
    @XmlElement(name = "SwtchRcvdDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar swtchRcvdDtTm;
    @XmlElement(name = "SwtchDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar swtchDt;
    @XmlElement(name = "SwtchTp", required = true)
    @XmlSchemaType(name = "string")
    protected SwitchType1Code swtchTp;
    @XmlElement(name = "SwtchSts")
    @XmlSchemaType(name = "string")
    protected SwitchStatus1Code swtchSts;
    @XmlElement(name = "BalTrfWndw")
    @XmlSchemaType(name = "string")
    protected BalanceTransferWindow1Code balTrfWndw;
    @XmlElement(name = "Rspn")
    protected List<ResponseDetails1> rspn;

    /**
     * Gets the value of the unqRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqRefNb() {
        return unqRefNb;
    }

    /**
     * Sets the value of the unqRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountSwitchDetails1 setUnqRefNb(String value) {
        this.unqRefNb = value;
        return this;
    }

    /**
     * Gets the value of the rtgUnqRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtgUnqRefNb() {
        return rtgUnqRefNb;
    }

    /**
     * Sets the value of the rtgUnqRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountSwitchDetails1 setRtgUnqRefNb(String value) {
        this.rtgUnqRefNb = value;
        return this;
    }

    /**
     * Gets the value of the swtchRcvdDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getSwtchRcvdDtTm() {
        return swtchRcvdDtTm;
    }

    /**
     * Sets the value of the swtchRcvdDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountSwitchDetails1 setSwtchRcvdDtTm(XMLGregorianCalendar value) {
        this.swtchRcvdDtTm = value;
        return this;
    }

    /**
     * Gets the value of the swtchDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getSwtchDt() {
        return swtchDt;
    }

    /**
     * Sets the value of the swtchDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountSwitchDetails1 setSwtchDt(XMLGregorianCalendar value) {
        this.swtchDt = value;
        return this;
    }

    /**
     * Gets the value of the swtchTp property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchType1Code }
     *     
     */
    public SwitchType1Code getSwtchTp() {
        return swtchTp;
    }

    /**
     * Sets the value of the swtchTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchType1Code }
     *     
     */
    public AccountSwitchDetails1 setSwtchTp(SwitchType1Code value) {
        this.swtchTp = value;
        return this;
    }

    /**
     * Gets the value of the swtchSts property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchStatus1Code }
     *     
     */
    public SwitchStatus1Code getSwtchSts() {
        return swtchSts;
    }

    /**
     * Sets the value of the swtchSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchStatus1Code }
     *     
     */
    public AccountSwitchDetails1 setSwtchSts(SwitchStatus1Code value) {
        this.swtchSts = value;
        return this;
    }

    /**
     * Gets the value of the balTrfWndw property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceTransferWindow1Code }
     *     
     */
    public BalanceTransferWindow1Code getBalTrfWndw() {
        return balTrfWndw;
    }

    /**
     * Sets the value of the balTrfWndw property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceTransferWindow1Code }
     *     
     */
    public AccountSwitchDetails1 setBalTrfWndw(BalanceTransferWindow1Code value) {
        this.balTrfWndw = value;
        return this;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rspn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRspn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseDetails1 }
     * 
     * 
     */
    public List<ResponseDetails1> getRspn() {
        if (rspn == null) {
            rspn = new ArrayList<ResponseDetails1>();
        }
        return this.rspn;
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
     * Adds a new item to the rspn list.
     * @see #getRspn()
     * 
     */
    public AccountSwitchDetails1 addRspn(ResponseDetails1 rspn) {
        getRspn().add(rspn);
        return this;
    }

}
