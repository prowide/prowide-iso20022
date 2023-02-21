
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.032.002.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnEvtPrcgStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.032.002.02")
public class MxSeev03200202
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnEvtPrcgStsAdvc", required = true)
    protected CorporateActionEventProcessingStatusAdviceV02Subset corpActnEvtPrcgStsAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 32;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CorporateActionEventProcessingStatusAdviceV02Subset.class, CorporateActionEventType4Choice.class, CorporateActionEventType6Code.class, CorporateActionGeneralInformation13 .class, CorporateActionNarrative19 .class, DocumentIdentification17 .class, DocumentIdentification21 .class, DocumentIdentification2Choice.class, DocumentNumber2Choice.class, EventProcessingStatus2Choice.class, GenericIdentification23 .class, GenericIdentification25 .class, MxSeev03200202 .class, NoReasonCode.class, NoSpecifiedReason1 .class, PendingReason4Code.class, PendingReason5Choice.class, PendingStatus5Choice.class, PendingStatusReason3 .class, ProprietaryReason2 .class, ProprietaryStatusAndReason2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:seev.032.002.02";

    public MxSeev03200202() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03200202(final String xml) {
        this();
        MxSeev03200202 tmp = parse(xml);
        corpActnEvtPrcgStsAdvc = tmp.getCorpActnEvtPrcgStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03200202(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnEvtPrcgStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventProcessingStatusAdviceV02Subset }
     *     
     */
    public CorporateActionEventProcessingStatusAdviceV02Subset getCorpActnEvtPrcgStsAdvc() {
        return corpActnEvtPrcgStsAdvc;
    }

    /**
     * Sets the value of the corpActnEvtPrcgStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventProcessingStatusAdviceV02Subset }
     *     
     */
    public MxSeev03200202 setCorpActnEvtPrcgStsAdvc(CorporateActionEventProcessingStatusAdviceV02Subset value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSeev03200202 parse(String xml) {
        return ((MxSeev03200202) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03200202 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03200202 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03200202) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03200202 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03200202 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03200202) parserImpl.read(MxSeev03200202 .class, xml, _classes));
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
     * Creates an MxSeev03200202 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03200202 message
     * @return
     *     a new instance of MxSeev03200202
     */
    public final static MxSeev03200202 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03200202 .class);
    }

}
