
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
 * Scope
 * The RequestForTransferStatusReport is sent by an instructing party to the executing party.
 * This message requests the status of a transfer instruction or the status of a transfer cancellation instruction.
 * Usage
 * The RequestForTransferStatusReport is sent by an instructing party to the executing party to request
 * - the status of one or several transfer instructions or
 * - the status of one or several transfer cancellation instructions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sese.009.001.01", propOrder = {
    "reqDtls"
})
public class Sese00900101 {

    @XmlElement(name = "ReqDtls", required = true)
    protected List<MessageAndBusinessReference1> reqDtls;

    /**
     * Gets the value of the reqDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reqDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageAndBusinessReference1 }
     * 
     * 
     */
    public List<MessageAndBusinessReference1> getReqDtls() {
        if (reqDtls == null) {
            reqDtls = new ArrayList<MessageAndBusinessReference1>();
        }
        return this.reqDtls;
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
     * Adds a new item to the reqDtls list.
     * @see #getReqDtls()
     * 
     */
    public Sese00900101 addReqDtls(MessageAndBusinessReference1 reqDtls) {
        getReqDtls().add(reqDtls);
        return this;
    }

}
