
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
 * Class for seev.044.002.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntPrlimryAdvcCxlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.044.002.03")
public class MxSeev04400203
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntPrlimryAdvcCxlAdvc", required = true)
    protected CorporateActionMovementPreliminaryAdviceCancellationAdvice002V03 corpActnMvmntPrlimryAdvcCxlAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 44;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification10 .class, AccountIdentification17Choice.class, AccountIdentification21 .class, CorporateActionEventStatus1 .class, CorporateActionEventType8Code.class, CorporateActionEventType9Choice.class, CorporateActionGeneralInformation43 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary2Choice.class, CorporateActionMovementPreliminaryAdviceCancellationAdvice002V03 .class, CorporateActionProcessingStatus1Choice.class, DocumentIdentification19 .class, EventCompletenessStatus1Code.class, EventConfirmationStatus1Code.class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, IdentificationSource4Choice.class, MxSeev04400203 .class, NameAndAddress12 .class, OtherIdentification2 .class, PartyIdentification51Choice.class, PartyIdentification56Choice.class, ProcessingPosition3Choice.class, ProcessingPosition3Code.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat5Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText5 .class, SecurityIdentification15 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:seev.044.002.03";

    public MxSeev04400203() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04400203(final String xml) {
        this();
        MxSeev04400203 tmp = parse(xml);
        corpActnMvmntPrlimryAdvcCxlAdvc = tmp.getCorpActnMvmntPrlimryAdvcCxlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04400203(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntPrlimryAdvcCxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementPreliminaryAdviceCancellationAdvice002V03 }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V03 getCorpActnMvmntPrlimryAdvcCxlAdvc() {
        return corpActnMvmntPrlimryAdvcCxlAdvc;
    }

    /**
     * Sets the value of the corpActnMvmntPrlimryAdvcCxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementPreliminaryAdviceCancellationAdvice002V03 }
     *     
     */
    public MxSeev04400203 setCorpActnMvmntPrlimryAdvcCxlAdvc(CorporateActionMovementPreliminaryAdviceCancellationAdvice002V03 value) {
        this.corpActnMvmntPrlimryAdvcCxlAdvc = value;
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
    public static MxSeev04400203 parse(String xml) {
        return ((MxSeev04400203) MxReadImpl.parse(MxSeev04400203 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04400203 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04400203) parserImpl.read(MxSeev04400203 .class, xml, _classes));
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
     * Creates an MxSeev04400203 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04400203 message
     * @return
     *     a new instance of MxSeev04400203
     */
    public final static MxSeev04400203 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04400203 .class);
    }

}
