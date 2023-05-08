
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for OutputChannelSessionDetails complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputChannelSessionDetails", propOrder = {
    "authstnDN",
    "qNm",
    "snFSessionId",
    "wndwSz",
    "subst",
    "ssnOpnTm",
    "ssnClsTm",
    "nbOfRcvdMsgs",
    "frstSnFOutptSeq",
    "lstSnFOutptSeq"
})
public class OutputChannelSessionDetails {

    @XmlElement(name = "AuthstnDN", required = true)
    protected String authstnDN;
    @XmlElement(name = "QNm", required = true)
    protected String qNm;
    @XmlElement(name = "SnFSessionId", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String snFSessionId;
    @XmlElement(name = "WndwSz", required = true)
    protected BigDecimal wndwSz;
    @XmlElement(name = "Subst")
    protected List<String> subst;
    @XmlElement(name = "SsnOpnTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar ssnOpnTm;
    @XmlElement(name = "SsnClsTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar ssnClsTm;
    @XmlElement(name = "NbOfRcvdMsgs", required = true)
    protected BigDecimal nbOfRcvdMsgs;
    @XmlElement(name = "FrstSnFOutptSeq")
    protected BigDecimal frstSnFOutptSeq;
    @XmlElement(name = "LstSnFOutptSeq")
    protected BigDecimal lstSnFOutptSeq;

    /**
     * Gets the value of the authstnDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthstnDN() {
        return authstnDN;
    }

    /**
     * Sets the value of the authstnDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OutputChannelSessionDetails setAuthstnDN(String value) {
        this.authstnDN = value;
        return this;
    }

    /**
     * Gets the value of the qNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQNm() {
        return qNm;
    }

    /**
     * Sets the value of the qNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OutputChannelSessionDetails setQNm(String value) {
        this.qNm = value;
        return this;
    }

    /**
     * StoreAndForwardSessionId
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFSessionId() {
        return snFSessionId;
    }

    /**
     * Sets the value of the snFSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OutputChannelSessionDetails setSnFSessionId(String value) {
        this.snFSessionId = value;
        return this;
    }

    /**
     * Gets the value of the wndwSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWndwSz() {
        return wndwSz;
    }

    /**
     * Sets the value of the wndwSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OutputChannelSessionDetails setWndwSz(BigDecimal value) {
        this.wndwSz = value;
        return this;
    }

    /**
     * Gets the value of the subst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the subst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the subst property.
     */
    public List<String> getSubst() {
        if (subst == null) {
            subst = new ArrayList<>();
        }
        return this.subst;
    }

    /**
     * Gets the value of the ssnOpnTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSsnOpnTm() {
        return ssnOpnTm;
    }

    /**
     * Sets the value of the ssnOpnTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OutputChannelSessionDetails setSsnOpnTm(Calendar value) {
        this.ssnOpnTm = value;
        return this;
    }

    /**
     * Gets the value of the ssnClsTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSsnClsTm() {
        return ssnClsTm;
    }

    /**
     * Sets the value of the ssnClsTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OutputChannelSessionDetails setSsnClsTm(Calendar value) {
        this.ssnClsTm = value;
        return this;
    }

    /**
     * Gets the value of the nbOfRcvdMsgs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfRcvdMsgs() {
        return nbOfRcvdMsgs;
    }

    /**
     * Sets the value of the nbOfRcvdMsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OutputChannelSessionDetails setNbOfRcvdMsgs(BigDecimal value) {
        this.nbOfRcvdMsgs = value;
        return this;
    }

    /**
     * Gets the value of the frstSnFOutptSeq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrstSnFOutptSeq() {
        return frstSnFOutptSeq;
    }

    /**
     * Sets the value of the frstSnFOutptSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OutputChannelSessionDetails setFrstSnFOutptSeq(BigDecimal value) {
        this.frstSnFOutptSeq = value;
        return this;
    }

    /**
     * Gets the value of the lstSnFOutptSeq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLstSnFOutptSeq() {
        return lstSnFOutptSeq;
    }

    /**
     * Sets the value of the lstSnFOutptSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OutputChannelSessionDetails setLstSnFOutptSeq(BigDecimal value) {
        this.lstSnFOutptSeq = value;
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
     * Adds a new item to the subst list.
     * @see #getSubst()
     * 
     */
    public OutputChannelSessionDetails addSubst(String subst) {
        getSubst().add(subst);
        return this;
    }

}
