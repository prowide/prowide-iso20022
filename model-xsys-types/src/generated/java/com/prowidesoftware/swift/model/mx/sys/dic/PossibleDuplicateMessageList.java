
package com.prowidesoftware.swift.model.mx.sys.dic;

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
 * Java class for PossibleDuplicateMessageList complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PossibleDuplicateMessageList", propOrder = {
    "pdm"
})
public class PossibleDuplicateMessageList {

    @XmlElement(name = "PDM", required = true)
    protected List<PossibleDuplicateMessage> pdm;

    /**
     * Gets the value of the pdm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pdm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PossibleDuplicateMessage }
     * 
     * 
     * @return
     *     The value of the pdm property.
     */
    public List<PossibleDuplicateMessage> getPDM() {
        if (pdm == null) {
            pdm = new ArrayList<>();
        }
        return this.pdm;
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
     * Adds a new item to the pDM list.
     * @see #getPDM()
     * 
     */
    public PossibleDuplicateMessageList addPDM(PossibleDuplicateMessage pDM) {
        getPDM().add(pDM);
        return this;
    }

}
