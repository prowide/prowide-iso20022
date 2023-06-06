
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The SecurityActivityReport message is sent by the executing party to an instructing party containing information about changes on securities reference data.
 * 
 * Scope and usage: 
 * It aims at informing about the changes occurred during a business date for securities reference data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityActivityAdviceV01", propOrder = {
    "msgHdr",
    "pgntn",
    "sctyActvty",
    "splmtryData"
})
public class SecurityActivityAdviceV01 {

    @XmlElement(name = "MsgHdr")
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "SctyActvty", required = true)
    protected SecurityStatement3 sctyActvty;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader1 }
     *     
     */
    public MessageHeader1 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader1 }
     *     
     */
    public SecurityActivityAdviceV01 setMsgHdr(MessageHeader1 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public SecurityActivityAdviceV01 setPgntn(Pagination1 value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the sctyActvty property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityStatement3 }
     *     
     */
    public SecurityStatement3 getSctyActvty() {
        return sctyActvty;
    }

    /**
     * Sets the value of the sctyActvty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityStatement3 }
     *     
     */
    public SecurityActivityAdviceV01 setSctyActvty(SecurityStatement3 value) {
        this.sctyActvty = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecurityActivityAdviceV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
