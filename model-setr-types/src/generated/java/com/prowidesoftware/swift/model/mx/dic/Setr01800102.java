
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
 * The RequestForOrderStatusReport is sent by an instructing party, eg, an investment manager or its authorised representative, to the executing party, eg, a transfer agent. There may be one or more intermediary parties between the instructing party and the executing party.
 * This message requests the status of one or several order instruction or order cancellation messages.
 * Usage
 * The RequestForOrderStatusReport message is used to request the status of:
 * - one or several order messages,
 * - one or several cancellation messages,
 * - one or several individual orders within a bulk or multiple order message.
 * If the RequestForOrderStatusReport message is used to request the status of several messages, then the instructing party will receive several reply messages from the executing party, ie, several OrderInstructionStatusReport messages and/or OrderCancellationStatusReport messages. The number of reply messages will match the number of references stated in the RequestForOrderStatusReport message.
 * The RequestForOrderStatusReport message may not be used to request the status of an investment account, a transfer or the status of a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setr.018.001.02", propOrder = {
    "reqDtls"
})
public class Setr01800102 {

    @XmlElement(name = "ReqDtls", required = true)
    protected List<MessageAndBusinessReference2> reqDtls;

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
     * {@link MessageAndBusinessReference2 }
     * 
     * 
     */
    public List<MessageAndBusinessReference2> getReqDtls() {
        if (reqDtls == null) {
            reqDtls = new ArrayList<MessageAndBusinessReference2>();
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
    public Setr01800102 addReqDtls(MessageAndBusinessReference2 reqDtls) {
        getReqDtls().add(reqDtls);
        return this;
    }

}
