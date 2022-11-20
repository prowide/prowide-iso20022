
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Reference of the message previously received and for which the delivery status is notified.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedReference1", propOrder = {
    "txUnqIdr",
    "msgRef"
})
public class RelatedReference1 {

    @XmlElement(name = "TxUnqIdr")
    protected String txUnqIdr;
    @XmlElement(name = "MsgRef")
    protected String msgRef;

    /**
     * Gets the value of the txUnqIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxUnqIdr() {
        return txUnqIdr;
    }

    /**
     * Sets the value of the txUnqIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RelatedReference1 setTxUnqIdr(String value) {
        this.txUnqIdr = value;
        return this;
    }

    /**
     * Gets the value of the msgRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgRef() {
        return msgRef;
    }

    /**
     * Sets the value of the msgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RelatedReference1 setMsgRef(String value) {
        this.msgRef = value;
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
