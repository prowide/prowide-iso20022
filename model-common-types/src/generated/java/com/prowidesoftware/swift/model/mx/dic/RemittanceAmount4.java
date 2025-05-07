
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
 * Provides details on the amounts of the referred document.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceAmount4", propOrder = {
    "rmtAmtAndTp",
    "adjstmntAmtAndRsn"
})
public class RemittanceAmount4 {

    @XmlElement(name = "RmtAmtAndTp")
    protected List<DocumentAmount1> rmtAmtAndTp;
    @XmlElement(name = "AdjstmntAmtAndRsn")
    protected List<DocumentAdjustment1> adjstmntAmtAndRsn;

    /**
     * Gets the value of the rmtAmtAndTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rmtAmtAndTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRmtAmtAndTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentAmount1 }
     * 
     * 
     */
    public List<DocumentAmount1> getRmtAmtAndTp() {
        if (rmtAmtAndTp == null) {
            rmtAmtAndTp = new ArrayList<DocumentAmount1>();
        }
        return this.rmtAmtAndTp;
    }

    /**
     * Gets the value of the adjstmntAmtAndRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjstmntAmtAndRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjstmntAmtAndRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentAdjustment1 }
     * 
     * 
     */
    public List<DocumentAdjustment1> getAdjstmntAmtAndRsn() {
        if (adjstmntAmtAndRsn == null) {
            adjstmntAmtAndRsn = new ArrayList<DocumentAdjustment1>();
        }
        return this.adjstmntAmtAndRsn;
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
     * Adds a new item to the rmtAmtAndTp list.
     * @see #getRmtAmtAndTp()
     * 
     */
    public RemittanceAmount4 addRmtAmtAndTp(DocumentAmount1 rmtAmtAndTp) {
        getRmtAmtAndTp().add(rmtAmtAndTp);
        return this;
    }

    /**
     * Adds a new item to the adjstmntAmtAndRsn list.
     * @see #getAdjstmntAmtAndRsn()
     * 
     */
    public RemittanceAmount4 addAdjstmntAmtAndRsn(DocumentAdjustment1 adjstmntAmtAndRsn) {
        getAdjstmntAmtAndRsn().add(adjstmntAmtAndRsn);
        return this;
    }

}
