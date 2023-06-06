
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.032.000.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnEvtPrcgStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.032.000.01")
public class MxSeev03200001
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnEvtPrcgStsAdvc", required = true)
    protected CorporateActionEventProcessingStatusAdviceV1 corpActnEvtPrcgStsAdvc;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 32;
    public static final transient int VARIANT = 0;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, CopyDuplicate1Code.class, CorporateActionEventProcessingStatusAdviceV1 .class, CorporateActionEventType3Choice.class, CorporateActionEventType6Code.class, CorporateActionGeneralInformation9 .class, CorporateActionNarrative10 .class, DateAndDateTimeChoice.class, DocumentIdentification11 .class, DocumentIdentification14 .class, DocumentIdentification1Choice.class, DocumentIdentification9 .class, DocumentNumber1Choice.class, EventProcessingStatus1Choice.class, Extension2 .class, ExtensionEnvelope1 .class, GenericIdentification19 .class, GenericIdentification20 .class, MxSeev03200001 .class, NameAndAddress5 .class, NoReasonCode.class, NoSpecifiedReason1 .class, PartyIdentification10Choice.class, PendingReason4Choice.class, PendingReason4Code.class, PendingStatus2Choice.class, PendingStatusReason2 .class, PostalAddress1 .class, ProprietaryReason1 .class, ProprietaryStatusAndReason1 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:seev.032.000.01";

    public MxSeev03200001() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03200001(final String xml) {
        this();
        MxSeev03200001 tmp = parse(xml);
        corpActnEvtPrcgStsAdvc = tmp.getCorpActnEvtPrcgStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03200001(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnEvtPrcgStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventProcessingStatusAdviceV1 }
     *     
     */
    public CorporateActionEventProcessingStatusAdviceV1 getCorpActnEvtPrcgStsAdvc() {
        return corpActnEvtPrcgStsAdvc;
    }

    /**
     * Sets the value of the corpActnEvtPrcgStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventProcessingStatusAdviceV1 }
     *     
     */
    public MxSeev03200001 setCorpActnEvtPrcgStsAdvc(CorporateActionEventProcessingStatusAdviceV1 value) {
        this.corpActnEvtPrcgStsAdvc = value;
        return this;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSeev03200001 parse(String xml) {
        return ((MxSeev03200001) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03200001 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03200001 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03200001) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03200001 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03200001 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03200001) parserImpl.read(MxSeev03200001 .class, xml, _classes));
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
     * Creates an MxSeev03200001 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03200001 message
     * @return
     *     a new instance of MxSeev03200001
     */
    public static final MxSeev03200001 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03200001 .class);
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
