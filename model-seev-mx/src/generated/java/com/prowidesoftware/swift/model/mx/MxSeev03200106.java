
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
 * Class for seev.032.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnEvtPrcgStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.032.001.06")
public class MxSeev03200106
    extends AbstractMX
{

    @XmlElement(name = "CorpActnEvtPrcgStsAdvc", required = true)
    protected CorporateActionEventProcessingStatusAdviceV06 corpActnEvtPrcgStsAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 32;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CorporateActionEventProcessingStatusAdviceV06 .class, CorporateActionEventType20Code.class, CorporateActionEventType52Choice.class, CorporateActionGeneralInformation109 .class, CorporateActionNarrative10 .class, DocumentIdentification33 .class, DocumentIdentification3Choice.class, DocumentIdentification9 .class, DocumentNumber5Choice.class, EventProcessingStatus3Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, MxSeev03200106 .class, NoReasonCode.class, NoSpecifiedReason1 .class, PendingReason32Choice.class, PendingReason4Code.class, PendingStatus41Choice.class, PendingStatusReason9 .class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.032.001.06";

    public MxSeev03200106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03200106(final String xml) {
        this();
        MxSeev03200106 tmp = parse(xml);
        corpActnEvtPrcgStsAdvc = tmp.getCorpActnEvtPrcgStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03200106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnEvtPrcgStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventProcessingStatusAdviceV06 }
     *     
     */
    public CorporateActionEventProcessingStatusAdviceV06 getCorpActnEvtPrcgStsAdvc() {
        return corpActnEvtPrcgStsAdvc;
    }

    /**
     * Sets the value of the corpActnEvtPrcgStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventProcessingStatusAdviceV06 }
     *     
     */
    public MxSeev03200106 setCorpActnEvtPrcgStsAdvc(CorporateActionEventProcessingStatusAdviceV06 value) {
        this.corpActnEvtPrcgStsAdvc = value;
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
    public static MxSeev03200106 parse(String xml) {
        return ((MxSeev03200106) MxReadImpl.parse(MxSeev03200106 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03200106 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03200106) parserImpl.read(MxSeev03200106 .class, xml, _classes));
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
     * Creates an MxSeev03200106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03200106 message
     * @return
     *     a new instance of MxSeev03200106
     */
    public final static MxSeev03200106 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev03200106 .class);
    }

}
