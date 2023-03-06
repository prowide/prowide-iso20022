
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
 * Identifies the underlying transaction(s) and/or batched entries.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntryDetails8", propOrder = {
    "btch",
    "txDtls"
})
public class EntryDetails8 {

    @XmlElement(name = "Btch")
    protected BatchInformation2 btch;
    @XmlElement(name = "TxDtls")
    protected List<EntryTransaction9> txDtls;

    /**
     * Gets the value of the btch property.
     * 
     * @return
     *     possible object is
     *     {@link BatchInformation2 }
     *     
     */
    public BatchInformation2 getBtch() {
        return btch;
    }

    /**
     * Sets the value of the btch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchInformation2 }
     *     
     */
    public EntryDetails8 setBtch(BatchInformation2 value) {
        this.btch = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntryTransaction9 }
     * 
     * 
     */
    public List<EntryTransaction9> getTxDtls() {
        if (txDtls == null) {
            txDtls = new ArrayList<EntryTransaction9>();
        }
        return this.txDtls;
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
     * Adds a new item to the txDtls list.
     * @see #getTxDtls()
     * 
     */
    public EntryDetails8 addTxDtls(EntryTransaction9 txDtls) {
        getTxDtls().add(txDtls);
        return this;
    }

}
