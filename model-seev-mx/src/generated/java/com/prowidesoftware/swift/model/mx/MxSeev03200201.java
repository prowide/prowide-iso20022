
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
 * Class for seev.032.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnEvtPrcgStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.032.002.01")
public class MxSeev03200201
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnEvtPrcgStsAdvc", required = true)
    protected CorporateActionEventProcessingStatusAdvice002V01 corpActnEvtPrcgStsAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 32;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CopyDuplicate1Code.class, CorporateActionEventProcessingStatusAdvice002V01 .class, CorporateActionEventType4Choice.class, CorporateActionEventType6Code.class, CorporateActionGeneralInformation13 .class, CorporateActionNarrative19 .class, DateAndDateTimeChoice.class, DocumentIdentification16 .class, DocumentIdentification17 .class, DocumentIdentification21 .class, DocumentIdentification2Choice.class, DocumentNumber2Choice.class, EventProcessingStatus2Choice.class, Extension2 .class, ExtensionEnvelope1 .class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, MxSeev03200201 .class, NameAndAddress12 .class, NoReasonCode.class, NoSpecifiedReason1 .class, PartyIdentification16Choice.class, PendingReason4Code.class, PendingReason5Choice.class, PendingStatus5Choice.class, PendingStatusReason3 .class, ProprietaryReason2 .class, ProprietaryStatusAndReason2 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:seev.032.002.01";

    public MxSeev03200201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03200201(final String xml) {
        this();
        MxSeev03200201 tmp = parse(xml);
        corpActnEvtPrcgStsAdvc = tmp.getCorpActnEvtPrcgStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03200201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnEvtPrcgStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventProcessingStatusAdvice002V01 }
     *     
     */
    public CorporateActionEventProcessingStatusAdvice002V01 getCorpActnEvtPrcgStsAdvc() {
        return corpActnEvtPrcgStsAdvc;
    }

    /**
     * Sets the value of the corpActnEvtPrcgStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventProcessingStatusAdvice002V01 }
     *     
     */
    public MxSeev03200201 setCorpActnEvtPrcgStsAdvc(CorporateActionEventProcessingStatusAdvice002V01 value) {
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
    public static MxSeev03200201 parse(String xml) {
        return ((MxSeev03200201) MxReadImpl.parse(MxSeev03200201 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03200201 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03200201) parserImpl.read(MxSeev03200201 .class, xml, _classes));
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
     * Creates an MxSeev03200201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03200201 message
     * @return
     *     a new instance of MxSeev03200201
     */
    public final static MxSeev03200201 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03200201 .class);
    }

}
