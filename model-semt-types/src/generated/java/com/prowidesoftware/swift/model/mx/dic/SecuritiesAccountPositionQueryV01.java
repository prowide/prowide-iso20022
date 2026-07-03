
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
 * The SecuritiesAccountPositionQuery message is sent by an account owner to an account servicer or servicing party to request an account view on the position at a particular point in time period, or during a particular time period, where all positions are summarised in the account structure that is compatible with the query.
 * 
 * Usage: 
 * The message may also be used to:
 *  -re-send a message previously sent (the sub-function of the message is Duplicate),
 * - provide a third party with a copy of a message for information (the sub-function of the message is Copy),
 * -re-send to a third party a copy of a message for information (the sub-function of the message is CopyDuplicate).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountPositionQueryV01", propOrder = {
    "stmt",
    "schCrit"
})
public class SecuritiesAccountPositionQueryV01 {

    @XmlElement(name = "Stmt", required = true)
    protected Statement571 stmt;
    @XmlElement(name = "SchCrit", required = true)
    protected PositionSearchCriteria21 schCrit;

    /**
     * Gets the value of the stmt property.
     * 
     * @return
     *     possible object is
     *     {@link Statement571 }
     *     
     */
    public Statement571 getStmt() {
        return stmt;
    }

    /**
     * Sets the value of the stmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement571 }
     *     
     */
    public SecuritiesAccountPositionQueryV01 setStmt(Statement571 value) {
        this.stmt = value;
        return this;
    }

    /**
     * Gets the value of the schCrit property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSearchCriteria21 }
     *     
     */
    public PositionSearchCriteria21 getSchCrit() {
        return schCrit;
    }

    /**
     * Sets the value of the schCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSearchCriteria21 }
     *     
     */
    public SecuritiesAccountPositionQueryV01 setSchCrit(PositionSearchCriteria21 value) {
        this.schCrit = value;
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
