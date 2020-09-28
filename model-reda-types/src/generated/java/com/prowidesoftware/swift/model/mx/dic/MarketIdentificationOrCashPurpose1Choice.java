
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of cash purpose or a securities market identifier.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketIdentificationOrCashPurpose1Choice", propOrder = {
    "sttlmInstrMktId",
    "cshSSIPurp"
})
public class MarketIdentificationOrCashPurpose1Choice {

    @XmlElement(name = "SttlmInstrMktId")
    protected MarketIdentification87 sttlmInstrMktId;
    @XmlElement(name = "CshSSIPurp")
    protected List<String> cshSSIPurp;

    /**
     * Gets the value of the sttlmInstrMktId property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification87 }
     *     
     */
    public MarketIdentification87 getSttlmInstrMktId() {
        return sttlmInstrMktId;
    }

    /**
     * Sets the value of the sttlmInstrMktId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification87 }
     *     
     */
    public MarketIdentificationOrCashPurpose1Choice setSttlmInstrMktId(MarketIdentification87 value) {
        this.sttlmInstrMktId = value;
        return this;
    }

    /**
     * Gets the value of the cshSSIPurp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshSSIPurp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshSSIPurp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCshSSIPurp() {
        if (cshSSIPurp == null) {
            cshSSIPurp = new ArrayList<String>();
        }
        return this.cshSSIPurp;
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
     * Adds a new item to the cshSSIPurp list.
     * @see #getCshSSIPurp()
     * 
     */
    public MarketIdentificationOrCashPurpose1Choice addCshSSIPurp(String cshSSIPurp) {
        getCshSSIPurp().add(cshSSIPurp);
        return this;
    }

}
