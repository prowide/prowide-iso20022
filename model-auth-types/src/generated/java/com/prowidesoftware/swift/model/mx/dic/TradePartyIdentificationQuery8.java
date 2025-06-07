
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Query of a trade party based on the identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradePartyIdentificationQuery8", propOrder = {
    "lei",
    "anyBIC",
    "clntId",
    "notRptd"
})
public class TradePartyIdentificationQuery8 {

    @XmlElement(name = "LEI")
    protected List<String> lei;
    @XmlElement(name = "AnyBIC")
    protected List<String> anyBIC;
    @XmlElement(name = "ClntId")
    protected List<String> clntId;
    @XmlElement(name = "NotRptd")
    @XmlSchemaType(name = "string")
    protected NotReported1Code notRptd;

    /**
     * Gets the value of the lei property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lei property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLEI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLEI() {
        if (lei == null) {
            lei = new ArrayList<String>();
        }
        return this.lei;
    }

    /**
     * Gets the value of the anyBIC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anyBIC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnyBIC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAnyBIC() {
        if (anyBIC == null) {
            anyBIC = new ArrayList<String>();
        }
        return this.anyBIC;
    }

    /**
     * Gets the value of the clntId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clntId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClntId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClntId() {
        if (clntId == null) {
            clntId = new ArrayList<String>();
        }
        return this.clntId;
    }

    /**
     * Gets the value of the notRptd property.
     * 
     * @return
     *     possible object is
     *     {@link NotReported1Code }
     *     
     */
    public NotReported1Code getNotRptd() {
        return notRptd;
    }

    /**
     * Sets the value of the notRptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotReported1Code }
     *     
     */
    public TradePartyIdentificationQuery8 setNotRptd(NotReported1Code value) {
        this.notRptd = value;
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
     * Adds a new item to the lEI list.
     * @see #getLEI()
     * 
     */
    public TradePartyIdentificationQuery8 addLEI(String lEI) {
        getLEI().add(lEI);
        return this;
    }

    /**
     * Adds a new item to the anyBIC list.
     * @see #getAnyBIC()
     * 
     */
    public TradePartyIdentificationQuery8 addAnyBIC(String anyBIC) {
        getAnyBIC().add(anyBIC);
        return this;
    }

    /**
     * Adds a new item to the clntId list.
     * @see #getClntId()
     * 
     */
    public TradePartyIdentificationQuery8 addClntId(String clntId) {
        getClntId().add(clntId);
        return this;
    }

}
