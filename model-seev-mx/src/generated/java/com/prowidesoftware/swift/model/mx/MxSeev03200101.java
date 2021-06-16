
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.032.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnEvtPrcgStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.032.001.01")
public class MxSeev03200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnEvtPrcgStsAdvc", required = true)
    protected CorporateActionEventProcessingStatusAdviceV01 corpActnEvtPrcgStsAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 32;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, CopyDuplicate1Code.class, CorporateActionEventProcessingStatusAdviceV01 .class, CorporateActionEventType3Choice.class, CorporateActionEventType6Code.class, CorporateActionGeneralInformation9 .class, CorporateActionNarrative10 .class, DateAndDateTimeChoice.class, DocumentIdentification11 .class, DocumentIdentification14 .class, DocumentIdentification1Choice.class, DocumentIdentification9 .class, DocumentNumber1Choice.class, EventProcessingStatus1Choice.class, Extension2 .class, ExtensionEnvelope1 .class, GenericIdentification19 .class, GenericIdentification20 .class, MxSeev03200101 .class, NameAndAddress5 .class, NoReasonCode.class, NoSpecifiedReason1 .class, PartyIdentification10Choice.class, PendingReason4Choice.class, PendingReason4Code.class, PendingStatus2Choice.class, PendingStatusReason2 .class, PostalAddress1 .class, ProprietaryReason1 .class, ProprietaryStatusAndReason1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.032.001.01";

    public MxSeev03200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03200101(final String xml) {
        this();
        MxSeev03200101 tmp = parse(xml);
        corpActnEvtPrcgStsAdvc = tmp.getCorpActnEvtPrcgStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnEvtPrcgStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventProcessingStatusAdviceV01 }
     *     
     */
    public CorporateActionEventProcessingStatusAdviceV01 getCorpActnEvtPrcgStsAdvc() {
        return corpActnEvtPrcgStsAdvc;
    }

    /**
     * Sets the value of the corpActnEvtPrcgStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventProcessingStatusAdviceV01 }
     *     
     */
    public MxSeev03200101 setCorpActnEvtPrcgStsAdvc(CorporateActionEventProcessingStatusAdviceV01 value) {
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
    public static MxSeev03200101 parse(String xml) {
        return ((MxSeev03200101) MxReadImpl.parse(MxSeev03200101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03200101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03200101) parserImpl.read(MxSeev03200101 .class, xml, _classes));
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
     * Creates an MxSeev03200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03200101 message
     * @return
     *     a new instance of MxSeev03200101
     */
    public final static MxSeev03200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03200101 .class);
    }

}
