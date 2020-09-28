
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for reda.063.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesAcctModCxlStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT1reda.063.001.01")
public class MxReda06300101
    extends AbstractMX
{

    @XmlElement(name = "SctiesAcctModCxlStsAdvc", required = true)
    protected SecuritiesAccountModificationCancellationStatusAdviceV01 sctiesAcctModCxlStsAdvc;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 63;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CancellationReason20 .class, CancellationReason34Choice.class, CancellationStatus23Choice.class, CancelledStatusReason11Code.class, DeniedReason18 .class, DeniedReason25Choice.class, DeniedReason8Code.class, DeniedStatus22Choice.class, GenericIdentification30 .class, MxReda06300101 .class, NoReasonCode.class, PendingReason15Code.class, PendingReason26 .class, PendingReason50Choice.class, PendingStatus54Choice.class, ProcessingStatus73Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, References22 .class, RejectionAndRepairReason35Choice.class, RejectionOrRepairReason35 .class, RejectionReason47Code.class, RejectionStatus28Choice.class, SecuritiesAccountModificationCancellationStatusAdviceV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT1reda.063.001.01";

    public MxReda06300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda06300101(final String xml) {
        this();
        MxReda06300101 tmp = parse(xml);
        sctiesAcctModCxlStsAdvc = tmp.getSctiesAcctModCxlStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda06300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesAcctModCxlStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountModificationCancellationStatusAdviceV01 }
     *     
     */
    public SecuritiesAccountModificationCancellationStatusAdviceV01 getSctiesAcctModCxlStsAdvc() {
        return sctiesAcctModCxlStsAdvc;
    }

    /**
     * Sets the value of the sctiesAcctModCxlStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountModificationCancellationStatusAdviceV01 }
     *     
     */
    public MxReda06300101 setSctiesAcctModCxlStsAdvc(SecuritiesAccountModificationCancellationStatusAdviceV01 value) {
        this.sctiesAcctModCxlStsAdvc = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxReda06300101 parse(String xml) {
        return ((MxReda06300101) MxReadImpl.parse(MxReda06300101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda06300101 parse(String xml, MxRead parserImpl) {
        return ((MxReda06300101) parserImpl.read(MxReda06300101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxReda06300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda06300101 message
     * @return
     *     a new instance of MxReda06300101
     */
    public final static MxReda06300101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxReda06300101 .class);
    }

}
